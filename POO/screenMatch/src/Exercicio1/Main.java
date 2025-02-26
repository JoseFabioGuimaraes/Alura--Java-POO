package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "505";
        musica1.artista ="Artic Monkeys";
        musica1.anoLancamento = 207;

        musica1.avaliar(10);
        musica1.avaliar(9);
        musica1.avaliar(10);

        musica1.exibeFichaTecnica();
        System.out.println(musica1.calculaAvaliacao());


        Carro carro1 = new Carro();

        carro1.modelo = "Celta";
        carro1.ano = 2002;
        carro1.cor = "Cinza";

        carro1.exibeFichaTecnica();
        System.out.println(carro1.idadeCarro());

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Fábio";
        aluno1.idade = 22;

        aluno1.exibeAluno();

    }
}
