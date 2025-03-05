package br.com.jfabiodev.screenmatch.Exercicios.Exercicio4.Produto;

public class Servico implements Vendavel{
    private double precoHora;

    @Override
    public double precoTotal(int quantidade) {
        return  precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        precoHora -= precoHora * (percentual/100);
    }
}
