package br.com.jfabiodev.screenmatch.Exercicios.Exercicio4.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(double numero) {
        for(int i = 1; i<11 ; i++){
            System.out.println(numero*i);
        }
    }
}
