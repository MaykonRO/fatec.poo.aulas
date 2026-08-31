package org.fatec.ex1;

/*
Um cartão de crédito pode ser atribuido a um cliente. para isso, 
é necessário seu nome. Todo cartão pode ser gold, platinum ou black. um cartão 
possui, também, um valor da fatura e o tipo do cartão influi em um desconto. 
o gold não da desconto, o platinum, 3% e o black 5%. implemente a classe em questão
todo cartão pode mostrar os dados

*/

public class Ex1 {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.nome = "jonas";
        c.nomeCartao = "meuCartao 1";
        c.tipoCartao = c.tipoCartao.PLATINUM;
        c.fatura = 300.00f;

        c.mostrarDados();
    }
}
