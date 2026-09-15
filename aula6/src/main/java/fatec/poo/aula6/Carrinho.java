package fatec.poo.aula6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author lab53
 */
public class Carrinho {
    private ArrayList<Produto> carrinho;

    public Carrinho() {
        carrinho = new ArrayList<>();
    }


    public void inserir(Produto pdt){
        if (pdt == null){
            System.out.println("Produto inválido");
            return;
        }

        if (!pdt.produtoValido()){
            System.err.println("Produto inválido");
            return;
        }
        carrinho.add(pdt);
        System.out.println("carrinho"+carrinho);
    }

    public Produto remover(int index){
        if (index < 0){
            System.err.println("Produto inválido");
        }
        return carrinho.remove(index);
    }

    public void listar(){
        for (Produto pdt : carrinho) {
            pdt.mostrar();
        }
    }

    public double calcularTotal(){
        int total = 0;
        for (Produto pdt : carrinho) {
            total += pdt.pegaPreco();
        }
        return total;
    }

    public HashMap<TipoProduto, Double> calcularTotalTipo() {
        HashMap<TipoProduto, Double> hm = new HashMap<>();

        double totalElet =0, totalEsc =0, totalAli = 0;

        for (Produto pdt : carrinho) {
            switch (pdt.pegaTipo()) {
                case ELETRONICO -> totalElet += pdt.pegaPreco();
                case ALIMENTACAO -> totalAli += pdt.pegaPreco();
                case ESCRITORIO -> totalEsc += pdt.pegaPreco();
            }
        }

        hm.put(TipoProduto.ELETRONICO, totalElet);
        hm.put(TipoProduto.ALIMENTACAO, totalAli);
        hm.put(TipoProduto.ESCRITORIO, totalEsc);

        return hm;
    }

    public void mostrarValores(){
        HashMap<TipoProduto, Double> hm = calcularTotalTipo();

        for (Entry<TipoProduto, Double> registro : hm.entrySet()){
            System.out.println(registro.getKey() + " -> "+ registro.getValue());
        }
    }
}

