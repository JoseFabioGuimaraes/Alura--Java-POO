package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooksAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o livro que deseja pesquisar: ");
        String livro = scanner.next();

        String link = "https://www.googleapis.com/books/v1/volumes?q=" + livro;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link))
                .build();
        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
