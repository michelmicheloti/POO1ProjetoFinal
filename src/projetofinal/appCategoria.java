/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import projetofinal.classes.Categoria;

/**
 *
 * @author miche
 */
public final class appCategoria {

    ArrayList<Categoria> categoria = new ArrayList<>();

    public appCategoria() {
        int op;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("1 - Criar Categoria");
            System.out.println("2 - Remover Categoria");
            System.out.println("3 - Alterar Categoria");
            System.out.println("4 - Pesquisar Categoria");
            System.out.println("5 - Litar Categoria");
            System.out.println("6 - Sair");
            System.out.println("Digite uma opção: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    Criar(s);
                    break;
                case 2:
                    Remover(s);
                    break;
                case 3:
                    Alterar(s);
                    break;
                case 4:
                    Pesquisar(s);
                    break;
                case 5:
                    Listar(s);
                    break;

            }
        } while (op != 5);
    }

    public void Criar(Scanner s) {
        System.out.println("******* Cadastro Categoria *******");
        System.out.println("Digite as informações da Categoria: ");
        System.out.print("Descrição: ");
        Categoria c = new Categoria(s.next());
        categoria.add(c);
    }

    public void Remover(Scanner s) {
        System.out.println("******* Remover Categoria *******");
        Listar(s);
        System.out.println("Digite o codigo da categoria: ");
        int cod = s.nextInt();
        if(categoria.get(cod) != null){
            categoria.remove(cod);
        }else{
            System.out.println("categoria não existe");
        }
        
    }

    public void Alterar(Scanner s) {
        
    }

    public void Pesquisar(Scanner s) {

    }
    
    public void Listar(Scanner s) {
        System.out.println("******* Lista de Clientes *******");     
        for (Categoria c : categoria) {
            System.out.println("_______________________");
            System.out.println("Codigo: " + c.getDescricao());
            System.out.println("_______________________");
        }
    }
}
