package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio4.Produto;

public class Produto implements Vendavel {
    private double preco;

    @Override
    public double precoTotal(int quantidade) {
       return  preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual/100);
    }
}
