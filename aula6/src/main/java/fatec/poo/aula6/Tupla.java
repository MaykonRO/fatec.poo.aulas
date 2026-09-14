package fatec.poo.aula6;

/**
 * @author Maykon
 */


public class Tupla<T> {

    private T primeiro, segundo;

    public Tupla(T primeiro, T segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public T getSegundo() {
        return segundo;
    }

}
