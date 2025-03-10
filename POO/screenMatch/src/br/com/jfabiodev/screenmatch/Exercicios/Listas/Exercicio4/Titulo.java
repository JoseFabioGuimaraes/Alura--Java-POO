package br.com.jfabiodev.screenmatch.Exercicios.Listas.Exercicio4;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Titulo outroNome) {
        return this.getNome().compareTo(outroNome.getNome());
    }
}
