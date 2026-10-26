package poo.aulas;

public interface Brincavel {
    
    void brincar();


    //METODOS CONCRETOS EM UMA INTERFACE
    //DEVEM SER MARCADOS COMO DEFAULT
    //ou como static
    public default void foo(){
        System.out.println("Foo");
    }

    public static void algo(){
        System.out.println("Algo!");
    }
}
