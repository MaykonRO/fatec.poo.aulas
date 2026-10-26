package poo.aulas;

import java.util.ArrayList;

public class PetShop {
    
    private ArrayList<Animal> jaula;

    public PetShop(){
        this.jaula = new ArrayList<>();
    }

    public void adicionar(Animal a){
        this.jaula.add(a);
    }

    public void gritaria(){
        for (Animal a : jaula){
            a.emitirSom();
        }
    }
}
