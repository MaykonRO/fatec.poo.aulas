/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.fatec.aula3;

/**
 *
 * @author lab53
 */
public class Sapo {
    private int qtPulo;
    private static int qtSapo;

    public Sapo(){
        qtPulo++;
        qtSapo++;
    }

    public void mostrarPulo(){
        System.out.println(qtPulo);
    }

    static void mostrarSapo(){
        System.out.println(qtSapo);
    }

}
