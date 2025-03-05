package br.com.jfabiodev.screenmatch.Exercicios.Exercicio4.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println(area);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double perimetro = 2 *(base+altura);
        System.out.println(perimetro);
    }
}
