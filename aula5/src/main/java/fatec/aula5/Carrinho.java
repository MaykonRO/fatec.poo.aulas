package fatec.aula5;

public class Carrinho {

    private Produto[] carrinho; //array estatico pede uma quantidade fixa de produtos

    private static int QT_MAX = 5;
    private int topo;

    public Carrinho() {
        //sem a linha abaixo, o carrinho não vai funcionar
        //pq o carrinho não vai estar criado na memoria
        carrinho = new Produto[QT_MAX];
    }

    public boolean estaVazio() {
        return topo == 0;
    }

    public boolean estaCheio() {
        return topo == QT_MAX;
    }

    // PRÉ CONDICAO: Produto nao esta nulo
    //              e Carrinho nao pode estar cheio
    //              e nome nao vazio
    //              e preco > 0
    public void inserir(Produto produto) {
        if (produto == null) {
            System.out.println("Produto nulo");
            return;
        }

        if (estaCheio()) {
            System.out.println("CArrinho cheio");
            return;
        }

        if (produto.produtoValido()) {
            System.out.println("Produto Invalido");
            return;
        }

        carrinho[topo++] = produto;
    }

    // pre condições: o carrinho nao pode esta vazio
    public Produto remover() {
        if (estaVazio()) {
            System.out.println("Carrinho vazio");
            return null;
        }

        Produto produtoRemovido = carrinho[--topo];
        return produtoRemovido;
    }

    public void listarProduto() {
        System.out.println("______________");
        for (int i = 0; i < topo; i++) {
            carrinho[i].mostrar();
        }
        System.out.println("______________");
    }

    
    public void calcularTotal(){
        double total = 0;
        for (int i = 0; i < topo; i++) {
            total += carrinho[i].pegaPreco();        
        }
        System.out.println("Total: R$"+ total);
    }

    public void calcularTotalTipo(TipoProduto tipo){
        double total = 0;
        for (int i = 0; i < topo; i++) {
            if (tipo == carrinho[i].pegaTipo()){
                total += carrinho[i].pegaPreco();        
            }
        }
        System.out.println("Total por tipo "+tipo+": R$"+ total);
    }

    
}
