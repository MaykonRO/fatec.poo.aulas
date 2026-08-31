/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.fatec.aula3;

/**
 *
 * @author lab53
 */
public class Aluno {
    private String nome;
    private double p1, p2;

    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = Math.max(0,Math.min(p1,10));
        this.p2 = Math.max(0,Math.min(p2,10));
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
    }

    public void setP1(double p1){
        this.p1 = p1;
    }
    
}
