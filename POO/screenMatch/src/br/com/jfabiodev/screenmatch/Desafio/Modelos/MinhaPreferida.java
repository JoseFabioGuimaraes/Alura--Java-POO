package br.com.jfabiodev.screenmatch.Desafio.Modelos;

public class MinhaPreferida {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >8 ){
            System.out.println(audio.getTitulo() + " é considerado TopHit");
        } else{
            System.out.println(audio.getTitulo() + " Boa opção para mais tarde");
        }

    }
}
