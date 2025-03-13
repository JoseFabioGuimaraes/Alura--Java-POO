package br.com.jfabiodev.screenmatch.Exercicios.API.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();


        try{
           int divisao = numero1 / numero2;
            System.out.println(numero1 +" / "+numero2+ " = " + divisao);
        }catch (ArithmeticException e){
            System.out.println("O número não pode ser divisivel por 0");
           // System.out.println("Error: " + e);
        }


        try {
            System.out.println("Digite sua senha: ");
            String senhaDigitada = leitor.next();
            Senha senha = new Senha(senhaDigitada);
            System.out.println("Senha aceita");
        } catch (SenhaInvalidaException e){
            System.out.println("Error: " + e.getMensagem());
        }


    }
}
