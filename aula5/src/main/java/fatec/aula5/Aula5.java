package fatec.aula5;

public class Aula5 {

    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 5.00, TipoProduto.ESCRITORIO);
        Produto p2 = new Produto("Caneta", 10.00, TipoProduto.ESCRITORIO);
        Produto p3 = new Produto("Coca Zero", 5.00, TipoProduto.ALIMENTACAO);
        Produto p4 = new Produto("Bis", 20.00, TipoProduto.ALIMENTACAO);
        Produto p5 = new Produto("Usb drive", 5.00, TipoProduto.ELETRONICO);
        Produto p6 = new Produto("caderno ney", 50.00, TipoProduto.ESCRITORIO);

        Carrinho c = new Carrinho();

        c.remover();
        c.inserir(p6);
        c.inserir(p3);
        c.inserir(p1);
        c.listarProduto();
        c.remover();
        c.listarProduto();
        c.inserir(p4);
        c.inserir(p2);
        c.inserir(p5);
        c.inserir(p1);
        c.listarProduto();
    }
}
