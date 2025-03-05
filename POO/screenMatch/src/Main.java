import br.com.jfabiodev.screenmatch.calculos.CalculadoraDeTempo;
import br.com.jfabiodev.screenmatch.calculos.FiltroRecomendacao;
import br.com.jfabiodev.screenmatch.models.Episodio;
import br.com.jfabiodev.screenmatch.models.Filme;
import br.com.jfabiodev.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Top gun");
        filme1.setAnoLancamento(1986);
        filme1.setDuracaoMinutos(180);

        Filme filme2 = new Filme();
        filme2.setNome("Interestelar");
        filme2.setAnoLancamento(2014);
        filme2.setDuracaoMinutos(120);

        filme1.exibeFichaTecnica();
        filme1.avalia(6.0);
        filme1.avalia(7.0);
        filme1.avalia(8.0);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie lost = new Serie();

        lost.setStatus(false);
        lost.setTemporadas(10);
        lost.setEpisodiosTemporadas(10);
        lost.setMinutosEpisodios(50);
        System.out.println(lost.getDuracaoMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualicoes(303);
        filtro.filtra(episodio);



    }
}