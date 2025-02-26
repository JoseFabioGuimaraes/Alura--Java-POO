import br.com.jfabiodev.screenmatch.models.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Top gun");
        filme1.setAnoLancamento(1986);
        filme1.setDuracaoMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(6.0);
        filme1.avalia(7.0);
        filme1.avalia(8.0);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());
    }
}