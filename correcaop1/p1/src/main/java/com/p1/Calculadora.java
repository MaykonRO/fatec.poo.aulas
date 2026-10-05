package com.p1;

/**
 *
 * @author lab53
 */
public class Calculadora {
    public static Maybe<Double> dividir(double a, double b){
        if (b==0){
            return Maybe.nothing();
        }

        return Maybe.just(a/b);
    }

    public static void mostrarResultado(Maybe<Double> numero){
        double valor = numero.get();
        System.out.println(valor);
    }

    public static void main(String[] args) {
        Maybe<Double> n1 = Calculadora.dividir(4,1);
        Maybe<Double> n2 = Calculadora.dividir(4,0);

        Calculadora.mostrarResultado(n1);
        Calculadora.mostrarResultado(n2);
    }
}
