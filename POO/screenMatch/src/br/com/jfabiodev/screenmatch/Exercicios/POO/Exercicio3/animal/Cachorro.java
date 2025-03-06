package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio3.animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("AU AU");
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo");
    }
}
