package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio3;

public class Circulo implements Forma{
     double raio;

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
