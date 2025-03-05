package br.com.jfabiodev.screenmatch.Exercicios.Exercicio3.animal;

public class Gato extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }

    public void arranharMovel(){
        System.out.println("O gato está arranhando o sofá");
    }
}
