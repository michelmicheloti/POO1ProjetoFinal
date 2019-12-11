/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author miche
 */
public class Pedido {
    private long numero;
    private Date data;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private Cliente cliente;
    
    private static int cod;
    private Boolean status = true;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public  Pedido(){
        numero = ++cod;
    }
    
    public void insereItem(ItemPedido item){
        this.itens.add(item);
    }
    
    public void removeItem(ItemPedido item){
        this.itens.remove(item);
    }
    
    public double totalPedido(){
        double total=0;
        for(ItemPedido i : itens){
            total+=i.totalItem();
        }
        return total;
    }
    
    public double totalImposto(){
        double total=0;
        for(ItemPedido i : itens){
            total += i.getQuantidade() * i.getProduto().getImposto();
        }
        return total;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        Pedido.cod = cod;
    }
    
    
}
