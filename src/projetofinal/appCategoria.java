/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.Scanner;

/**
 *
 * @author Fernando Dias Motta 180016 / Michel Micheloti 181003
 */
public final class appCategoria {
    
    public appCategoria(){
        int op;
        
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("1 - Criar Categoria");
            System.out.println("2 - Remover Categoria");
            System.out.println("3 - Alterar Categoria");
            System.out.println("4 - Pesquisar Categoria");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção: ");
            op = s.nextInt();
            
            switch(op){
                case 1:
                    Criar();
                    break;
                case 2:
                    Remover();
                    break;
                case 3:
                    Alterar();
                    break;
                case 4:
                    Pesquisar();
                    break;
                
            }
        }while(op != 5);
    }
    
    public void Criar(){
       
    }    

    public void Remover(){
        
    }
    
    public void Alterar(){
        
    }
    
    public void Pesquisar(){
        
    }
}
