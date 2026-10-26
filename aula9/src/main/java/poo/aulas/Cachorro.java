package poo.aulas;


//Cachorro <= Animal
//Cachorro <= Brincavel
//Cachorro <= Nadavel
public class Cachorro extends Animal implements Brincavel, Nadavel {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "AUAU");
    }

    
    //Métodos abstratos possuem a obrigação de sobrescrita, os default/static não
    @Override
    public void brincar() {
        System.out.println("Brincou com o cachorro");
    }

    @Override
    public void Nadar() {
        System.out.println("Nadou cachorrinho");
    }
}
