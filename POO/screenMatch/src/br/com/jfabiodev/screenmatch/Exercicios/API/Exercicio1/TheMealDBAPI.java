package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDBAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o receita que deseja pesquisar: ");
        var receita = scanner.next();

        var link = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link))
                .build();
        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
