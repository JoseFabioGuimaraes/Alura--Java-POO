package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio4.Moeda;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converteDolarParaReal(double quantEmDolar) {
        return quantEmDolar * 6;
    }
}
