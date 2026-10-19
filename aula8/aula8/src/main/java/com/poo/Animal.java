/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.poo;

/**
 *
 * @author lab53
 */
public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void dormir(){
        System.out.println(nome + " zzz");
    }

    public void emitirSom(){
        System.out.println("som generico");
    }

}
