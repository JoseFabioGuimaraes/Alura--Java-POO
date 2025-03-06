package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fábio");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Francisco");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Fernanda");


        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());

        for(Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }

    }
}
