package br.com.jfabiodev.screenmatch.Exercicios.Exercicio4.Temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double tempCelsius) {
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println(tempFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double tempFahrenheit) {
        double tempCelsius = (tempFahrenheit - 32) / 1.8;
        System.out.println(tempCelsius);
    }
}
