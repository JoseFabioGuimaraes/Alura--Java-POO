package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio3.Conta;

public class ContaBancaria {
    protected double saldo = 0;

    public double consultarSaldo(){
        return saldo;
    }
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Deposito realizado, seu saldo agora é de: " + this.saldo);
    }
    public void sacar(double valorSaque){
        if (valorSaque > saldo){
            System.out.println("O valor é maior que seu saldo, tente novamente\nSeu saldo é de: R$" + saldo);
        } else {
            saldo -= valorSaque;
            System.out.println("Transação Realizada\nSeu saldo é de: R$" + saldo);
        }
    }
}
