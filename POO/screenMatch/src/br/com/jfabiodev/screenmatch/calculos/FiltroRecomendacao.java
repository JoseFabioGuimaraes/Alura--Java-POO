package br.com.jfabiodev.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificacao classificacao){
        if(classificacao.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if(classificacao.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Assista depois");
        }
    }

}
