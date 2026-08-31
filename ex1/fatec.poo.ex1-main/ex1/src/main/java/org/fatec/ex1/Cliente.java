package org.fatec.ex1;

public class Cliente {
    String nome;
    String nomeCartao;
    TipoCartao tipoCartao;
    float fatura;

    public void Cliente(
        String nome, 
        String nomeCartao, 
        TipoCartao tipoCartao, 
        float fatura
    ){
        this.nome = nome;
        this.nomeCartao = nomeCartao;
        this.fatura = fatura;
        this.tipoCartao = tipoCartao;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        Cartao cc = new Cartao();
        cc.nomeCartao = nomeCartao;
        cc.fatura = fatura;
        cc.cartao = tipoCartao;

        cc.mostrarCartao();
    }
}
