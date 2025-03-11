package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGeckoAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a criptomoeda que deseja pesquisar: ");
        String criptomoeda = scanner.next();

        String link = "https://api.coingecko.com/api/v3/simple/price?ids="+ criptomoeda + "&vs_currencies=brl";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link))
                .build();
        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
