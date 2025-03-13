package br.com.jfabiodev.screenmatch.Desafio.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaEmJson(apiViaCEP endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(endereco);

        FileWriter fileWriter = new FileWriter(endereco.localidade()+".json");
        fileWriter.write(json);
        fileWriter.close();
    }
}
