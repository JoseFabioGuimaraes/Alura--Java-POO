package br.com.jfabiodev.screenmatch.Exercicios.exercicio2;

public class Livro {
    private String autor;
    private String titulo;

    public void exibeDetalhes(){
        System.out.println("O titulo é: " + titulo + " do autor: " + autor);
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
