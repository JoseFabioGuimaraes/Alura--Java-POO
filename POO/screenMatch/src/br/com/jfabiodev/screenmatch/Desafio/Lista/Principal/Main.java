package br.com.jfabiodev.screenmatch.Desafio.Lista.Principal;

import br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos.Carrinho;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu limite: ");
        double limite = leitor.nextDouble();
        leitor.nextLine();
        List<Carrinho> carrinhoList = new ArrayList<>();

        int opcao = 1;
        while (opcao != 0){
            System.out.println("Digite o nome produto comprado: ");
            String nomeProduto = leitor.nextLine();
            System.out.println("Digite o valor do produto: ");
            double precoProduto = leitor.nextDouble();
            leitor.nextLine();

            Carrinho carrinho = new Carrinho(nomeProduto,precoProduto);
            if(precoProduto > limite){
                System.out.println("Produto acima do limite do cartão");
            } else {
                carrinhoList.add(carrinho);
                System.out.println("Compra adicionada com sucesso");
            }
            System.out.println("Digite 1 para continuar comprando ou 0 para sair");
            opcao = leitor.nextInt();
            leitor.nextLine();
        }

        carrinhoList.sort(Comparator.comparing(Carrinho::getPreco));

        System.out.println("""
                **************************************
                O carrinho está:
                """);
        for (Carrinho carrinho:carrinhoList){
            System.out.println("Produto: " +carrinho.getNome() + "Preço: R$" + carrinho.getPreco());
        }
        System.out.println("**************************************");

    }
}
