package br.com.jfabiodev.screenmatch.exececao;

public class ErrorDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErrorDeConversaoDeAnoException(String s) {
        this.mensagem = s;
    }


    public String getMensagem() {
        return this.mensagem;
    }
}
