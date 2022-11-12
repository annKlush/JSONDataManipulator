package task3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String urlCompleted = "https://jsonplaceholder.typicode.com/users/1/todos?completed=false";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlCompleted))
                .build();

        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Task3.statusCode() = " + response.statusCode());
        System.out.println("Task3.body() = " + response.body());
    }
}
