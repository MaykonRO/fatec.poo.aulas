package fatec.aula5;

public class Produto {
    private String nome;
    private double preco;
    private TipoProduto tipoProduto;

    public Produto(String nome, double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Tipo do produto: "+tipoProduto);
    }

}
