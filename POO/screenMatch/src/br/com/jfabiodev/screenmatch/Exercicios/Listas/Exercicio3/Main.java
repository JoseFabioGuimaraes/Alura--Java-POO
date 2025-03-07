package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fábio");
        nomes.add("Junior");
        nomes.add("Edward");

        for (String nome: nomes){
            System.out.println("O nome é: " + nome);
        }

        //Cachorro cachorro = new Cachorro();
       Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("Não é");
        }

        Produto produto1 = new Produto("Computador",2000);
        Produto produto2 = new Produto("Notebook",1500);
        Produto produto3 = new Produto("SmartWatch",1000);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double valorTotal = 0;
        for (Produto produto : listaProdutos){
            valorTotal += produto.getPreco();
        }

        double media = valorTotal / listaProdutos.size();

        System.out.println("O valor medio é de: R$" + media);

        Circulo circulo = new Circulo();
        circulo.setRaio(5.0);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for(Forma item: listaFormas){
            System.out.println("A área é: " + item.calcularArea());
        }

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumConta(121564);
        conta1.setSaldo(4000);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumConta(121566);
        conta2.setSaldo(6000);
        ContaBancaria conta3 = new ContaBancaria();
        conta3.setNumConta(121565);
        conta3.setSaldo(400);

        double maiorSaldo = conta1.getSaldo();

        ArrayList<ContaBancaria> contasLista = new ArrayList<>();
        contasLista.add(conta1);
        contasLista.add(conta2);
        contasLista.add(conta3);

        for(ContaBancaria conta : contasLista ){
            if(conta.getSaldo() > maiorSaldo){
                maiorSaldo = conta.getSaldo();
            }
        }
        System.out.println("O maior saldo é: " + maiorSaldo);

    }
}
