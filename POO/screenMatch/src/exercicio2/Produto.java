package exercicio2;

public class Produto {
    private String nome;
    private double preco;

    public double aplicaDesconto(int desconto){
        return preco - (preco * desconto /100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
