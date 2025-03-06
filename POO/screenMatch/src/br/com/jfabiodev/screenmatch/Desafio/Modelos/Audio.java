package br.com.jfabiodev.screenmatch.Desafio.Modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificacao;

    public void curtir(){
        this.totalCurtidas ++;
    }

    public void reproduz(){
        this.totalReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
