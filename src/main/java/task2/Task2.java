package task2;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Task2 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        String urlP = "https://jsonplaceholder.typicode.com/users/1/posts?id=10";
//
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlP))
//                .build();
//
//        HttpClient client = HttpClient.newBuilder()
//                .version(HttpClient.Version.HTTP_1_1)
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println("StatusCode() = " + response.statusCode());
//        System.out.println("Body() = " + response.body());

        for (int n = 46; n < 50; n++) {
            String urlC = "https://jsonplaceholder.typicode.com/posts/10/comments/?id=" + n;

            HttpRequest request6Comments = HttpRequest.newBuilder().uri(URI.create(urlC))
                    .build();
            HttpClient client6Comments = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .build();

            HttpResponse<String> response6Comments = client6Comments.send(request6Comments, HttpResponse.BodyHandlers.ofString());
            System.out.println("StatusCode() = " + response6Comments.statusCode());
            System.out.println("Body() = " + response6Comments.body());
            String[] arr = response6Comments.body().split("\n");
            String comment = arr[4] + "\n" + arr[6];

            try (FileWriter file = new FileWriter("user-" + n + "-post-" + "10-comments.json")) {
                file.write(comment);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
