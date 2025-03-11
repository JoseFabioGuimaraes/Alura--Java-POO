package br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos;

public class Compra {
    private String nome;
    private double preco;

    public Compra(String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compra: Nome do produto: " + nome + "\n Valor do produto: " + preco ;
    }
}
