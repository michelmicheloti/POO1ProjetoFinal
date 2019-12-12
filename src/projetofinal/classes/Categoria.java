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
public class Categoria {
    private String descricao; 
    private static int cod;

    public Categoria(String descricao) {
        cod++;
        this.descricao = descricao;
    }

    public static int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
