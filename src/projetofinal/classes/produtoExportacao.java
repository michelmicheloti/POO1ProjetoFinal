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
public class produtoExportacao extends projetofinal.classes.Produto {

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    private String destino;
    
}
