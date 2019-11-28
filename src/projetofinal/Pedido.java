/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author miche
 */
public class Pedido {
    private long numero;
    private Date data;
    private ArrayList<ItemPedido> itens;
    private Cliente cliente;
    
    public double totalPedido(){
        return 0;
    }
    
    public double totalImposto(){
        return 0;
    }
}
