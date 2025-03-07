package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio2;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private int dataVencimento;


    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataVencimento) {
        super(nome, preco, quantidade);
        this.dataVencimento = dataVencimento;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
