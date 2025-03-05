package br.com.jfabiodev.screenmatch.Exercicios.Exercicio4.CalculoPreco;

public class ProdutoFisico implements Calculavel{
    private double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
