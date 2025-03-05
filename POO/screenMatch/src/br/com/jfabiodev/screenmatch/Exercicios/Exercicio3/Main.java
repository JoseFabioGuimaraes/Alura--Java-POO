package br.com.jfabiodev.screenmatch.Exercicios.Exercicio3;

import br.com.jfabiodev.screenmatch.Exercicios.Exercicio3.Conta.ContaCorrente;
import br.com.jfabiodev.screenmatch.Exercicios.Exercicio3.carro.ModeloCarro;
import br.com.jfabiodev.screenmatch.Exercicios.Exercicio3.numeros.GeradorPrimo;
import br.com.jfabiodev.screenmatch.Exercicios.Exercicio3.numeros.NumerosPrimos;
import br.com.jfabiodev.screenmatch.Exercicios.Exercicio3.numeros.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.definirModelo("Sedan");
        carro.definirPrecos(30000,72000,350000);
        carro.exibirInfo();

        ContaCorrente contaCC = new ContaCorrente();
        contaCC.depositar(2000);
        contaCC.sacar(300);
        contaCC.tarifaMensal();
        System.out.println("Seu saldo é: R$"+contaCC.consultarSaldo());

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(50);



    }
}
