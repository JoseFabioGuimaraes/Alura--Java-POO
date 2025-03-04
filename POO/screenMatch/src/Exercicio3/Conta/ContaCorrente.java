package Exercicio3.Conta;

public class ContaCorrente extends ContaBancaria{
    private double tarifa = 2.00;

    public void tarifaMensal(){
        saldo = saldo - tarifa;
        System.out.println("Sua tarifa mensal é de: R$" + tarifa);
    }
}
