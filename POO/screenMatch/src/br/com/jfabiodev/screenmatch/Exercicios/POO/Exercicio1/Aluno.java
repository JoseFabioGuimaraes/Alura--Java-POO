package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio1;

public class Aluno {
    String nome;
    int idade;

    void exibeAluno(){
        String aluno = """
                Aluno: %s
                Idade: %d
                """.formatted(nome,idade);
        System.out.println(aluno);
    }
}
