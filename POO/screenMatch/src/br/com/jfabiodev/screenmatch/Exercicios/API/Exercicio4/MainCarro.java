package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio4;

import com.google.gson.Gson;

public class MainCarro {
    public static void main(String[] args) {
        Veiculos carro = new Veiculos("Onix", "chevrolet", 2022);
        Gson gson = new Gson();
        String jsonCarro = gson.toJson(carro);
        System.out.println(jsonCarro);
    }
}
