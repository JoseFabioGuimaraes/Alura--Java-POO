package br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos;

public class Carrinho {
    private String nome;
    private double preco;

    public Carrinho(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
