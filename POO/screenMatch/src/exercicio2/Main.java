package exercicio2;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Fábio");
        pessoa1.setIdade(22);

        pessoa1.verificaIdade();

        Produto produto1 = new Produto();
        produto1.setPreco(1000);
        System.out.println(produto1.aplicaDesconto(10));

    }
}
