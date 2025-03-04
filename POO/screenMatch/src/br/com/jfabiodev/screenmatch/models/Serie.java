package br.com.jfabiodev.screenmatch.models;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosTemporadas;
    private boolean status;
    private  int minutosEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporadas() {
        return episodiosTemporadas;
    }

    public void setEpisodiosTemporadas(int episodiosTemporadas) {
        this.episodiosTemporadas = episodiosTemporadas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getMinutosEpisodios() {
        return minutosEpisodios;
    }

    public void setMinutosEpisodios(int minutosEpisodios) {
        this.minutosEpisodios = minutosEpisodios;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosTemporadas * minutosEpisodios;
    }
}
