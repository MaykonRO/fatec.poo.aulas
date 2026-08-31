package fatec.aula5;

public class Carrinho {

    private Produto[] carrinho; //array estatico pede uma quantidade fixa de produtos

    private static int QT_MAX = 5;

    public Carrinho(){
        carrinho = new Produto[QT_MAX];
    }
}
