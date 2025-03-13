package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio4;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTXT {
    public static void main(String[] args) {

        try (FileWriter escrita = new FileWriter("arquivo.txt")) {
            escrita.write("Conteúdo a ser gravado no arquivo");
            escrita.close();
            System.out.println("Arquivo salvo com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
