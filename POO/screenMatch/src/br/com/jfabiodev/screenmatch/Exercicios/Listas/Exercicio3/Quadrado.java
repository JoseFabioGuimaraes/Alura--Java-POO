package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio3;

public class Quadrado implements Forma{
    private double lado;

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
