package fatec.poo.aula6;

/**
 * @author Maykon
 */


public class Tupla<T, U> {

    private T primeiro, segundo;
    private U terceiro;

    public Tupla(T primeiro, T segundo, U terceira) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public T getSegundo() {
        return segundo;
    }

    public U getTerceiro() {
        return terceiro;
    }


}
