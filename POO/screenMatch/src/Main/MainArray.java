package Main;

import br.com.jfabiodev.screenmatch.models.Filme;
import br.com.jfabiodev.screenmatch.models.Serie;
import br.com.jfabiodev.screenmatch.models.Titulo;

import java.util.*;

public class MainArray {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Top gun",1986);
        filme1.setDuracaoMinutos(180);
        filme1.avalia(9);

        Filme filme2 = new Filme("Interestelar",2014);
        filme2.setDuracaoMinutos(120);
        filme2.avalia(6);

        var meuFilme = new Filme("Todo mundo em panico",2000);
        meuFilme.avalia(10);

        Serie serie = new Serie("Lost",2000);

        Filme f1 = meuFilme;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(meuFilme);
        lista.add(serie);

        for (Titulo titulo : lista){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> artistasList = new ArrayList<>();
        artistasList.add("Adam Sandler");
        artistasList.add("Manu Gavassi");
        artistasList.add("Gabriel Jesus");
        System.out.println(artistasList);

        Collections.sort(artistasList);
        System.out.println("Depois de ordenado: " + artistasList);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: "+ lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}
