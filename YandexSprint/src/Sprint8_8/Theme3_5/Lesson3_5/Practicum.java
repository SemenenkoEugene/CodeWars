package Sprint8_8.Theme3_5.Lesson3_5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        // укажите URL запроса, включая его параметры
        URI url = URI.create("https://api.exchangerate.host/convert?base=RUB&symbols=USD&symbols=EUR");

        // создайте объект, описывающий запрос с необходимой информацией
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .header("Accept","application/json")
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Код статуса: " + response.statusCode());
            System.out.println("Ответ: " + response.body());
        } catch (IOException | InterruptedException e) { // обработка ошибки отправки запроса
            System.out.println("Во время выполнения запроса ресурса по URL-адресу: '" + url + "' возникла ошибка.\n" +
                               "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
    }
}
