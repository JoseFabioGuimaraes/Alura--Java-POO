package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio3;

public class Senha {
    private String senha;

    public Senha(String senha){
        this.senha = senha;
        if (senha.length() < 8){
            throw new SenhaInvalidaException("Senha tem menos que 08 caracteres");
        }
    }

}
