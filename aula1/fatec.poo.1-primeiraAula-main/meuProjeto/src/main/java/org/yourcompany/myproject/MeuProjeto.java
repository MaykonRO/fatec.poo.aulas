package org.yourcompany.myproject;

public class MeuProjeto {
    public static void main(String[] args) {
        Contador cont = new Contador();

        cont.decrementar();
        cont.incrementar();
        cont.incrementar();
        cont.mostrar();
        

        Cachorro c = new Cachorro();
        c.nome = "baidu";
        c.raca = "Husky ";

        c.latir();
        c.mostrarRaca();

        Cachorro d = new Cachorro();

        d.nome = "princesa";
        d.raca = "pitbull";

        d.latir();
        d.mostrarRaca();
    }
}
