package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacao;

    void exibeFichaTecnica(){
        String fichaTecnica = """
                Música: %s
                Artista: %s
                Ano de lançamento: %d
                """.formatted(titulo,artista,anoLancamento);
        System.out.println(fichaTecnica);
    }

    void avaliar(double nota){
        somaAvaliacao += nota;
        numAvaliacao++;
    }

    double calculaAvaliacao(){
        return somaAvaliacao / numAvaliacao;
    }
}
