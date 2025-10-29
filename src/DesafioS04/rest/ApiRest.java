package DesafioS04.rest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRest {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;

    public String getApiRest(String uri){

        request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            throw new RuntimeException("Error call API");
        }
    }
}
