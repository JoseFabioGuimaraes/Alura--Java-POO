package br.com.jfabiodev.screenmatch.models;

import br.com.jfabiodev.screenmatch.exececao.ErrorDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private  int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOMMDB meuTituloOMBD) {
        this.nome = meuTituloOMBD.title();
        if(meuTituloOMBD.year().length() > 4){
            throw new ErrorDeConversaoDeAnoException("Não consegue converter o ano" +
                    " por ter mais de 04 caracteres");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOMBD.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOMBD.runtime().substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setinncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    @Override
    public String toString() {
        return "(nome= " + nome + " ano de Lancamento=" + anoLancamento + " Duração: " + duracaoMinutos + ")";
    }

    @Override
    public int compareTo(Titulo segundoTitulo) {
        return this.getNome().compareTo(segundoTitulo.getNome());
    }
}


