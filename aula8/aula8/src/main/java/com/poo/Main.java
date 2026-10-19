package com.poo;

public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("bidu");
        c.dormir();

        Animal a = new Animal("boi da cara preta");

        a.dormir();

        c.emitirSom();

    }
}