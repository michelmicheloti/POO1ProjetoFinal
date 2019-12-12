/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import com.oracle.jrockit.jfr.Producer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import projetofinal.classes.Categoria;
import projetofinal.classes.Cliente;
import projetofinal.classes.Produto;
import projetofinal.classes.ProdutoMercadoInterno;
import projetofinal.classes.produtoExportacao;

/**
 *
 * @author Fernando Dias Motta 180016 / Michel Micheloti 181003
 */
public final class appProduto {

    ArrayList<Produto> produtos = new ArrayList();

    public appProduto() {
        int op;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("1 - Criar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Pesquisar Produto");
            System.out.println("5 - Litar Produto");
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
                    Pesquisar();
                    break;
                case 5:
                    Listar(s);
                    break;

            }
        } while (op != 6);
    }

    public void Criar(Scanner s) {
        int op;
        System.out.println("******* Cadastrar Prouto *******");
        Produto produto = null;
        do {
            System.out.println("Escolha a opcao que desejar");
            System.out.print("1 - Produto Mercado Interno");
            System.out.print("2 - Produto Exportação");
            System.out.println("3 - Sair");
            op = s.nextInt();
            switch (op) {
                case 1:
                    ProdutoMercadoInterno PMI = new ProdutoMercadoInterno();
                    System.out.println("Esse produto possui incentivo ? <s/n> ");
                    PMI.setIncentivo("s".equals(s.next()));
                    produto = PMI;
                    break;
                case 2:
                    produtoExportacao PE = new produtoExportacao();
                    System.out.println("Qual o destina da importação: ");
                    PE.setDestino(s.next());
                    produto = PE;
                    break;
            }
        } while (op != 3);
        System.out.println("Digite as informacoes do produto");
        System.out.print("Nome Produto: ");
        produto.setNome(s.next());

        System.out.print("Preço: ");
        produto.setPreco(s.nextDouble());

        System.out.print("Imposto: ");
        produto.setImposto(s.nextDouble());

        System.out.print("Moeda: ");
        produto.setMoeda(s.nextInt());

        System.out.print("Categoria: ");
        produto.setCategoria();

    }

    public void Remover(Scanner s) {
        do {
            System.out.println("******* Excluir produto *******");
            System.out.println("Digite as informações do Produto: ");
            System.out.println("Codigo: ");
            int cod = s.nextInt();
            if (produtos.get(cod) != null) {
                System.out.println("O Produto selecionado para ser excluido: " + produtos.get(cod).getNome());
                produtos.remove(cod);
                System.out.println("*** Produto excluido ***");
                s.equals("n");
            } else {
                System.out.println("Produto não existe!");
                System.out.println("Deseja passar outro codigo ? <s/n>: ");
                s.next();
            }
        } while (s.equals("n"));
    }

    public void Alterar(Scanner s) {
        int op;
        do {
            System.out.println("******* Alterar Produto *******");
            System.out.println("Digite as informações do Produto: ");
            System.out.println("Codigo: ");
            int cod = s.nextInt();
            if (produtos.get(cod) != null) {
                System.out.println("O Produto selecionado para ser alterado: " + produtos.get(cod).getNome());
                do {
                    System.out.println("O que deseja alterar ? ");
                    System.out.println("1-Nome");
                    System.out.println("2-Preco");
                    System.out.println("3-Categoria");
                    System.out.println("4-Imposto");
                    System.out.println("5-Sair");
                    op = s.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Novo Nome: ");
                            produtos.get(cod).setNome(s.next());
                            break;
                        case 2:
                            System.out.println("Novo Preco: ");
                            produtos.get(cod).setPreco(s.nextDouble());
                            break;
                        case 3:
                            System.out.println("Novo Imposto: ");
                            produtos.get(cod).setImposto(s.nextDouble());
                            break;
                        case 4:
                            System.out.println("Novo Categoria: ");
                            produtos.get(cod).setCategoria(s.next());
                            break;
                    }
                } while (op != 4);
                s.equals("n");
            } else {
                System.out.println("Produto não existe!");
                System.out.println("Deseja passar outro codigo ? <s/n>: ");
                s.next();
            }
        } while (s.equals("n"));
    }

    public void Pesquisar(Scanner s) {
        do {
            System.out.println("******* Pesquisar Produto *******");
            System.out.println("Digite as informações do Produto: ");
            System.out.println("Codigo: ");
            int cod = s.nextInt();
            if (produtos.get(cod) != null) {
                System.out.println("******* Produto Encontrado *******");
                System.out.println("Codigo: " + produtos.get(cod).getCodigo());
                System.out.println("Nome: " + produtos.get(cod).getNome());
                System.out.println("Categoria: " + produtos.get(cod).getCategoria());
                System.out.println("Preco: " + produtos.get(cod).getPreco());
                System.out.println("Moeda: " + produtos.get(cod).getMoeda());
                System.out.println("Imposto: " + produtos.get(cod).getImposto());
                s.equals("n");
            } else {
                System.out.println("Produto não existe!");
                System.out.println("Deseja passar outro codigo ? <s/n>: ");
                s.next();
            }
        } while (s.equals("n"));
    }

    public void Listar(Scanner s) {
        System.out.println("******* Lista de Clientes *******");
        for (Produto p : produtos) {
            System.out.println("_______________________");
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println("Preco: " + p.getPreco());
            System.out.println("Moeda: " + p.getMoeda());
            System.out.println("Imposto: " + p.getImposto());
            System.out.println("_______________________");
        }
    }
}
