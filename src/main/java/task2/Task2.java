package task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String urlP = "https://jsonplaceholder.typicode.com/users/1/posts";
        String resp = Jsoup.connect(urlP)
                .ignoreContentType(true)
                .get()
                .body()
                .text();

        Type type = TypeToken
                .getParameterized(List.class, User.class)
                .getType();
        List<User> user = new Gson().fromJson(resp, type);

        final int[] a = {0};


        for (User item : user) {
            if (item.getId() > a[0]) {
                a[0] = item.getId();
            }
        }

            String urlC = "https://jsonplaceholder.typicode.com/posts/" + a[0] + "/comments/";

            HttpRequest request6Comments = HttpRequest.newBuilder().uri(URI.create(urlC))
                    .build();
            HttpClient client6Comments = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .build();
            HttpResponse<String> response6Comments = client6Comments.send(request6Comments, HttpResponse.BodyHandlers.ofString());


            String comment = response6Comments.body();

            try (FileWriter file = new FileWriter("user-1" + "-post-" +a[0]+"-comments.json")) {
                file.write(comment);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File create or update");
        }

}
