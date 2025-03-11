package br.com.jfabiodev.screenmatch.Desafio.Lista.Modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public Boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getPreco()){
            this.saldo -= compra.getPreco();
            this.compras.add(compra);
            return true;
        }
        return false;
        }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

}
