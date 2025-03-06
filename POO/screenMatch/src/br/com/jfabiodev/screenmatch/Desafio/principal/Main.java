package br.com.jfabiodev.screenmatch.Desafio.principal;

import br.com.jfabiodev.screenmatch.Desafio.Modelos.MinhaPreferida;
import br.com.jfabiodev.screenmatch.Desafio.Modelos.Musica;
import br.com.jfabiodev.screenmatch.Desafio.Modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Like That");
        musica1.setCantor("Metro bommin, Future");

        for(int i = 0; i<1000; i++){
            musica1.reproduz();
        }

        for (int i = 0; i <50 ; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Flow podcats");
        podcast1.setApresentador("Igor 3K");

        for(int i = 0; i<5000; i++){
            podcast1.reproduz();
        }
        for (int i = 0; i <1000 ; i++) {
            podcast1.curtir();
        }

        MinhaPreferida preferidas = new MinhaPreferida();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);




    }
}
