package org.yourcompany.myproject;


public class Contador {
    int quantidade;

    void incrementar(){
        quantidade++;
    }

    void decrementar(){
        if (quantidade > 0) quantidade--; else System.out.println("Não pode ser menor que 0");
    }

    void zerar(){
        quantidade = 0;
    }

    void mostrar(){
        System.out.println("Quantidade: "+ quantidade);
    }

}
