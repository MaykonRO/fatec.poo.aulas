package poo.aulas;

public class Main {
    public static void main(String[] args) {
        Gato g = new Gato("Frajola");
        g.brincar();
        g.emitirSom();

        Cachorro c = new Cachorro("REX");
        c.emitirSom();
        c.brincar();
        c.nadar();

        g.foo();
        c.foo();
        
        //Em tempo de compilação o java NÃO sabe que é gato
        Animal g1 = new Gato("Frajolinha");
        g1.emitirSom();

        // isso não pode
        // g1.ronrronar();


        g.ronrronar();

        //isso pode
        Gato h = (Gato) g;
        h.ronrronar();
        

        //ate consigo fazer a associação pois não compilou
        //mas vai dar um erro em tempo de compilação
        /*
        Animal z = new Cachorro("Bidu");
        Gato w = (Gato) z; ClassCast Exception, não
        posso transformar Cachorro em Gato
        w.ronrronar();
        */

        Gato g2 = new Gato("Garfield");
        Animal a2 = (Animal) g2;
        a2.dormir();
    }
}