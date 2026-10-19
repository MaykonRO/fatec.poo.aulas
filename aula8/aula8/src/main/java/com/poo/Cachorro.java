/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.poo;

/**
 * @author lab53
 */
public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    public void latir(){
        System.out.println(getNome() + ": AUAU");
    }

}
