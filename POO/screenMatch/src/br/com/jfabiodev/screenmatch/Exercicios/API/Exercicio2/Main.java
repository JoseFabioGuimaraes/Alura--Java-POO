package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Fabio\",\"cidade\":\"João Pessoa\"}";
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Record Pessoa: " + pessoa);

        String jsonLivro = "{\"nome\":\"Django Avançado\",\"autor\":\"Richard\",\"editora\":{\"nome\":\"Richard Company\",\"cidade\":\"Moscou, Russia\"}}";
        gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro,Livro.class);
        System.out.println("Livro informações: " + livro);

    }
}
