package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio3.numeros;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
