package br.com.jfabiodev.screenmatch.Desafio.API;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o numero do CEP: ");
        String numCep = scanner.nextLine();

        try{
            apiViaCEP novoEndereco = consultaCep.buscaEndereco(numCep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaEmJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }



    }
}
