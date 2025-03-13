package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio3;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;

    public SenhaInvalidaException(String s){
        this.mensagem = s;
    }


    public String getMensagem() {
        return this.mensagem;
    }
}
