package org.fatec.ex1;

public class Cartao {
    Float fatura;
    TipoCartao cartao;
    String nomeCartao;

    public void Cartao(String nomeCartao, float fatura, TipoCartao cartao){
        this.cartao = cartao;
        this.nomeCartao = nomeCartao;
        this.fatura = fatura;
    }

    void mostrarCartao(){
        calculaFatura();
        System.out.println("Nome do cartao: "+nomeCartao);
        System.out.println("Fatura do cartao: "+fatura);
        System.out.println("Tipo do cartao: "+cartao);
    }

    void calculaFatura(){
        switch (cartao) {
            case PLATINUM:
                    fatura = fatura*.97f;
                break;
            case BLACK:
                fatura = fatura*.95f;
                break;
            case GOLD: 
                fatura = fatura;
            default:
                break;
        }
    }
}
