package org.fatec.aula3;

public class Aula3 {

    public static void main(String[] args) {
        Aluno alu = new Aluno("joao", 6,5);
        Foo f = new Foo();
        Sapo s1 = new Sapo();
        Sapo s2 = new Sapo();
        Sapo s3 = new Sapo();
        
        s1.mostrarPulo();
        s2.mostrarPulo();
        s2.mostrarPulo();

        Sapo.mostrarSapo();

        alu.setP1(-8); // o metodo setter influi negativamente na regra de negocio
        alu.mostrar();



        f.x = 5; //acesso de escrita ao atributo x da classe foo
        // f.y = 6; não permitido pois y não é visivel aqui
        //f.z = 6; não permite pois não esta no mesmo pacote
        f.setY(3);
        System.out.println(f.x); //Acesso de leitura
        //System.out.println(f.y); ,
        System.out.println(f.getY());
    }
}
