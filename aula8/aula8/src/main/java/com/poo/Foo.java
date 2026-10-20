/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo;

/**
 *
 * @author lab53
 */
public class Foo {

    //LP=[]
    public void algo() {
        System.out.println("algo sem parametro");
    }

    // LP=[ int ]
    public void algo(int x) {
        System.out.println("algo com 1 parametro: " + x);
    }

    /* Não compila, pois a lista de paramentros  e' exatamente a mesma
    public void algo(int x){
        System.out.println("algo com 1 parametro: "+ x);
        }
     */

    // LP=[ int, String ]
    public void algo(int x, String y) {
        System.out.println("algo com 1 parametro: " + x + " " + y);
    }

    // LP=[ String, int ]
    public void algo(String y, int x) {
        System.out.println("algo com 1 parametro: " + y + " " + x);
    }

}
