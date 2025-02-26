package Exercicio1;

public class Carro {
    String modelo;
    String cor;
    int ano;


    void exibeFichaTecnica(){
        String fichaTecnica = """
                Modelo: %s
                Cor: %s
                Ano: %d
                """.formatted(modelo,cor,ano);
        System.out.println(fichaTecnica);
    }

    int idadeCarro(){
        return 2025 - ano;
    }
}
