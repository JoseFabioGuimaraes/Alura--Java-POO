package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> statusList;

        List<Integer> numeros = new ArrayList<>();
        numeros.add(11);
        numeros.add(1);
        numeros.add(4);
        numeros.add(60);
        numeros.add(22);
        numeros.sort(Comparator.comparing(Integer::intValue));
        System.out.println(numeros);

        //Lista nomes:
        List<Titulo> nomes = new ArrayList<>();
        var nome1 = new Titulo("Fabio");
        var nome2 = new Titulo("Alberto");
        var nome3 = new Titulo("Zefa");
        nomes.add(nome1);
        nomes.add(nome2);
        nomes.add(nome3);

        Collections.sort(nomes);
        System.out.println(nomes);

        // Likend List
        statusList = new LinkedList<>();
        statusList.add("Ativo");
        statusList.add("Pendente");
        statusList.add("Inativo");

        System.out.println("ArrayList: " + nomes);
        System.out.println("LinkedList: " + statusList);



    }
}
