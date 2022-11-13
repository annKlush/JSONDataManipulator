package task3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;
import task3.UsersFor3;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Task3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String urlCompleted = "https://jsonplaceholder.typicode.com/users/1/todos";
        String resp = Jsoup.connect(urlCompleted)
                .ignoreContentType(true)
                .get()
                .body()
                .text();

        Type type = TypeToken
                .getParameterized(List.class, UsersFor3.class)
                .getType();
        List<UsersFor3> user = new Gson().fromJson(resp, type);

        String complete = "false";
        user = user.stream()
                .filter(item -> complete.equals(item.getCompleted()))
                .collect(Collectors.toList());
        System.out.println(user);
    }
}
