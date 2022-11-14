package task1;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class PortTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://jsonplaceholder.typicode.com/users";
        PortTest por = new PortTest();
        por.firstPoint(url);
        por.secondPoint(url);
        por.thirdPoint();
        por.fourthPoint();
        por.fifthPoint();
    }

    public void firstPoint(String url) throws IOException, InterruptedException {
        System.out.println("---first point---");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(user))
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Post.statusCode() = " + response.statusCode());
        System.out.println("Post.body() = " + response.body());
    }

    void secondPoint(String url) throws IOException, InterruptedException {
        System.out.println("---second point---");
        HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create(url))
                .build();
        HttpClient client2 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response2 = client2.send(request2, HttpResponse.BodyHandlers.ofString());
        System.out.println("GetInfoAboutAll.statusCode() = " + response2.statusCode());
        System.out.println("GetInfoAboutAll.body() = " + response2.body());

        System.out.println("---third point---");
        String urlUpd = "https://jsonplaceholder.typicode.com/users/1";
        HttpRequest request1 = HttpRequest.newBuilder().uri(URI.create(urlUpd))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(user))
                .build();
        HttpClient client1 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response1 = client1.send(request1, HttpResponse.BodyHandlers.ofString());
        System.out.println("Update.statusCode() = " + response1.statusCode());
        System.out.println("Update.body() = " + response1.body());
    }

    void thirdPoint() throws IOException, InterruptedException {
        System.out.println("---fourth point---");
        String urlDelete = "https://jsonplaceholder.typicode.com/users/8";
        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create(urlDelete))
                .DELETE()
                .build();
        HttpClient client3 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response3 = client3.send(request3, HttpResponse.BodyHandlers.ofString());
        System.out.println("Delete.statusCode() = " + response3.statusCode());
        System.out.println("Delete.body() = " + response3.body());
    }

    void fourthPoint() throws IOException, InterruptedException {
        System.out.println("---fifth point---");
        String urlUser = "https://jsonplaceholder.typicode.com/users/2";
        HttpRequest request4 = HttpRequest.newBuilder().uri(URI.create(urlUser))
                .build();
        HttpClient client4 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response4 = client4.send(request4, HttpResponse.BodyHandlers.ofString());
        System.out.println("GetInfoAboutOne.statusCode() = " + response4.statusCode());
        System.out.println("GetInfoAboutOne.body() = " + response4.body());
    }

    void fifthPoint() throws IOException, InterruptedException {
        System.out.println("---six point---");
        String urlU = "https://jsonplaceholder.typicode.com/users?username=Leopoldo_Corkery";
        HttpRequest request5 = HttpRequest.newBuilder().uri(URI.create(urlU))
                .build();
        HttpClient client5 = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response5 = client5.send(request5, HttpResponse.BodyHandlers.ofString());
        System.out.println("GetInfoByUsername.statusCode() = " + response5.statusCode());
        System.out.println("GetInfoByUsername.body() = " + response5.body());
    }
    public String user=
        " {\n" +
                "    \"name\": \"Kurtis1 Weissnat1\",\n" +
                "    \"username\": \"Elwyn.Skiles\",\n" +
                "    \"email\": \"Telly.Hoeger@billy.biz\",\n" +
                "    \"address\": {\n" +
                "      \"street\": \"Rex Trail\",\n" +
                "      \"suite\": \"Suite 280\",\n" +
                "      \"city\": \"Howemouth\",\n" +
                "      \"zipcode\": \"58804-1099\",\n" +
                "      \"geo\": {\n" +
                "        \"lat\": \"24.8918\",\n" +
                "        \"lng\": \"21.8984\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"phone\": \"210.067.6132\",\n" +
                "    \"website\": \"elvis.io\",\n" +
                "    \"company\": {\n" +
                "      \"name\": \"Johns Group\",\n" +
                "      \"catchPhrase\": \"Configurable multimedia task-force\",\n" +
                "      \"bs\": \"generate enterprise e-tailers\"\n" +
                "    }\n" +
                "  }";

}
