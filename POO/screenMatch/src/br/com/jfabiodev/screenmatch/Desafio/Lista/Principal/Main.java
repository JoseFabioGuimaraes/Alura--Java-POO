package br.com.jfabiodev.screenmatch.Desafio.Lista.Principal;

import br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos.CartaoCredito;
import br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos.Compra;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitor.nextDouble();
        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite o nome do produto comprado: ");
            String nome = leitor.next();

            System.out.println("Digite o valor da compra: ");
            double preco = leitor.nextDouble();
            Compra compra = new Compra(nome,preco);
            boolean compraRealizada = cartaoCredito.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitor.nextInt();
            }else{
                System.out.println("Saldo insuficiente ");
                sair = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        cartaoCredito.getCompras().sort(Comparator.comparing(Compra::getPreco));

        for (Compra compra : cartaoCredito.getCompras()){
            System.out.println(compra.getNome() + "-" + compra.getPreco());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartaoCredito.getSaldo());

    }
}
