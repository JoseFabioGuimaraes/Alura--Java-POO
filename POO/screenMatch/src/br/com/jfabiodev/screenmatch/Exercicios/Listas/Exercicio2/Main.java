package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Computador",2100.00,10);
        Produto produto2 = new Produto("Notebook",1500.00,50);
        Produto produto3 = new Produto("Teclado",130.00,89);

        ArrayList<Produto> produtosList = new ArrayList<>();
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);

        for(Produto produto: produtosList){
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Saco de arroz",12.00,150,12122025);
        System.out.println(produtoPerecivel +" Validade: "+ produtoPerecivel.getDataVencimento());
    }
}
