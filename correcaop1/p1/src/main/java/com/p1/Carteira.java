package com.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class Carteira {

    private ArrayList<Dinheiro> valores;

    public Carteira(ArrayList<Dinheiro> valores) {
        this.valores = valores;
    }

    public HashMap<Cedula, Double> listartotal() {

        double qtReal = 0;
        double qtUSD = 0;
        double qtEuro = 0;

        for (Dinheiro d : valores) {
            switch (d.cedula()) {
                case BRL -> qtReal += d.valor();
                case EUR -> qtEuro += d.valor();
                case USD -> qtUSD += d.valor();
            }
        }

        HashMap<Cedula, Double> hm = new HashMap<>();
        hm.put(Cedula.EUR, qtEuro);
        hm.put(Cedula.BRL, qtEuro);
        hm.put(Cedula.USD, qtEuro);
        
        return hm;
    }

    public Dinheiro converteParaBRL(Dinheiro d) {
        double valor = 0;

        switch (d.cedula()) {
            case BRL ->
                valor = d.valor();
            case EUR ->
                valor += d.valor() * 5.2;
            case USD ->
                valor += d.valor() * 6.1;
        }
        return new Dinheiro(d.cedula(), valor);

    }

    public double calcularEmBRL() {
        double accum = 0;
        for (Dinheiro d : valores) {
            accum += converteParaBRL(d).valor();
        }
        return accum;
    }

}
