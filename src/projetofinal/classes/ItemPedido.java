/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.classes;

/**
 *
 * @author miche
 */
public class ItemPedido {
    private int numero;
    private int quantidade;
    private Produto produto;
    
    private static int cod;

    public ItemPedido() {
        this.numero = ++cod;
    }    
    
    public double totalItem(){
        return produto.getPreco()*quantidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
