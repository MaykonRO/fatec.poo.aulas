package poo.aulas;


//Gato <= Animal
//Gato <= Brincavel
public class Gato extends Animal implements Brincavel {
    
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + ": MIAU");
    }

    @Override
    public void brincar() {
        System.out.println("BRINCOU COM O GATO");
    }

    public void ronrronar(){
        System.out.println("Purl");
    }
}
