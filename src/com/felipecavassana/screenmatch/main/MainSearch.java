package com.felipecavassana.screenmatch.main;

import com.felipecavassana.screenmatch.exception.ErroDeConversaoDeAnoException;
import com.felipecavassana.screenmatch.model.Title;
import com.felipecavassana.screenmatch.model.record.TitleOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecture = new Scanner(System.in);
        System.out.printf("Digite um nome de filme: ");
        String searchTitle = lecture.nextLine();
        String webSearchApi = "https://www.omdbapi.com/?t="+ URLEncoder.encode(searchTitle) +"&apikey=dba06b5e";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(webSearchApi))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TitleOMDB titleOMDB = gson.fromJson(json, TitleOMDB.class);
            System.out.println(titleOMDB.toString());

            Title myTitle = new Title(titleOMDB);
            System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente!");

    }
}
