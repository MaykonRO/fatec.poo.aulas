package com.p1;

/**
 * @author lab53
 */
public class Maybe<T> {
    private T valor;
    private boolean hasValue;

    public Maybe(T valor, boolean hasValue) {
        this.valor = valor;
        this.hasValue = hasValue;
    }

    public static <T> Maybe<T> just(T valor){
        return new Maybe(valor, true);
    }

    public static <T> Maybe<T> nothing(){
        return new Maybe(null, false);
    }

    public T get(){
        if (!hasValue){
            System.out.println("Erro");
            return null;
        }
        return valor;
    }
    
}

