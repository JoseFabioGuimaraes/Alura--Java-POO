package br.com.jfabiodev.screenmatch.models;

import br.com.jfabiodev.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
