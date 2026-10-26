package poo.aulas;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void dormir(){
        System.out.println(nome + " zzz");
    }

    public void emitirSom(){
        System.out.println("som generico");
    }
}
