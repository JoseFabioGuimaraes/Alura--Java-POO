import br.com.jfabiodev.screenmatch.calculos.CalculadoraDeTempo;
import br.com.jfabiodev.screenmatch.calculos.FiltroRecomendacao;
import br.com.jfabiodev.screenmatch.models.Episodio;
import br.com.jfabiodev.screenmatch.models.Filme;
import br.com.jfabiodev.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Top gun",1986);
        filme1.setDuracaoMinutos(180);

        Filme filme2 = new Filme("Interestelar",2014);
        filme2.setDuracaoMinutos(120);

        filme1.exibeFichaTecnica();
        filme1.avalia(6.0);
        filme1.avalia(7.0);
        filme1.avalia(8.0);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie lost = new Serie("Lost",2000);

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

        var meuFilme = new Filme("Todo mundo em panico",2000);
        meuFilme.setDuracaoMinutos(88);
        meuFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(meuFilme);

        System.out.println("Quantidade na lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}