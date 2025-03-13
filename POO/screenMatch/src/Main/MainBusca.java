package Main;


import br.com.jfabiodev.screenmatch.exececao.ErrorDeConversaoDeAnoException;
import br.com.jfabiodev.screenmatch.models.Titulo;
import br.com.jfabiodev.screenmatch.models.TituloOMMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String buscar= "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!buscar.equalsIgnoreCase("sair")){
            System.out.println("Qual filme você deseja pesquisar?");
            var filme = scanner.nextLine();

            if(filme.equalsIgnoreCase("sair")){
                break;
            }
            var busca = "https://www.omdbapi.com/?t="+filme.replace(" ","+")+"&apikey=f9173cff";


            System.out.println(busca);

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(busca))
                        .build();
                HttpResponse<String> response = client
                        .send(request,HttpResponse.BodyHandlers.ofString());
                var json = response.body();
                System.out.println(json);


                TituloOMMDB meuTituloOMBD = gson.fromJson(json,TituloOMMDB.class);
                System.out.println(meuTituloOMBD);
                // try {
                Titulo meuTitulo = new Titulo(meuTituloOMBD);
                System.out.println("\n" + meuTitulo + " Duração: " + meuTitulo.getDuracaoMinutos());

                titulos.add(meuTitulo);


            }   catch (NumberFormatException e){
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Argumento invalido: ");
                System.out.println("Error: " + e);
            } catch (ErrorDeConversaoDeAnoException e){
                System.out.println("error: " + e.getMensagem());
            }
        }
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println(titulos);
    }
}