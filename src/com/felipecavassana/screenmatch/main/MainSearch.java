package com.felipecavassana.screenmatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecture = new Scanner(System.in);
        System.out.printf("Digite um nome de filme: ");
        String searchTitle = lecture.nextLine();

        String webSearchApi = "https://www.omdbapi.com/?t="+ searchTitle +"&apikey=dba06b5e";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(webSearchApi))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
