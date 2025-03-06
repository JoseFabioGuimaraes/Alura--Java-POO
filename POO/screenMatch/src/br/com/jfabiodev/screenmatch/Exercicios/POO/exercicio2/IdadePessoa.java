package br.com.jfabiodev.screenmatch.Exercicios.POO.exercicio2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificaIdade(){
        if(idade <18){
            System.out.println("A pessoa é menor de idade");
        } else {
            System.out.println("A pessoa é maior de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
