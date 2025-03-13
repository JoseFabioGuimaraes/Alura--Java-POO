package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainTitulo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Magico de oz",1984,"Erick");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
