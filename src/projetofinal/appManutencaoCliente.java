/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import com.sun.security.ntlm.Client;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import projetofinal.classes.Cliente;

/**
 *
 * @author Fernando Dias Motta 180016 / Michel Micheloti 181003
 */
public final class appManutencaoCliente {

    ArrayList<Cliente> cliente = new ArrayList<>();

    public appManutencaoCliente() {
        int op;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("1 - Criar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Alterar Cliente");
            System.out.println("4 - Pesquisar Cliente");
            System.out.println("5 - Sair");
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
        } while (op != 6);
    }

    public void Criar(Scanner s) {
        Cliente cli = new Cliente();
        System.out.println("******* Cadastrar cliente *******");
        System.out.println("Digite as informações do Cliente: ");
        System.out.println("Nome: ");
        cli.setNome(s.next());
        System.out.println("Endereco: ");
        cli.setEndereco(s.next());
        System.out.println("Telefone: ");
        cli.setTelefone(s.next());
        System.out.println("Limite: ");
        cli.setLimite(s.nextDouble());

        cliente.add(cli);
    }

    public void Remover(Scanner s) {

        do {
            System.out.println("******* Excluir cliente *******");
            System.out.println("Digite as informações do Cliente: ");
            System.out.println("Codigo: ");
            int cod = s.nextInt();
            if (cliente.get(cod) != null) {
                System.out.println("O Cliente selecionado para ser excluido: " + cliente.get(cod).getNome());
                cliente.remove(cod);
                s.equals("n");
            } else {
                System.out.println("Cliente não existe!");
                System.out.println("Deseja passar outro codigo ? <s/n>: ");
                s.next();
            }
        } while (s.equals("n"));
    }

    public void Alterar(Scanner s) {
        int op;
        do {
            System.out.println("******* Alterar cliente *******");
            System.out.println("Digite as informações do Cliente: ");
            System.out.println("Codigo: ");
            int cod = s.nextInt();
            if (cliente.get(cod) != null) {
                System.out.println("O Cliente selecionado para ser alterado: " + cliente.get(cod).getNome());
                do {
                    System.out.println("O que deseja alterar ? ");
                    System.out.println("1-Nome");
                    System.out.println("2-Limite");
                    System.out.println("3-Endereco");
                    System.out.println("4-Sair");
                    op = s.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Novo Nome: ");
                            cliente.get(cod).setNome(s.next());
                            break;
                        case 2:
                            System.out.println("Novo Limite: ");
                            cliente.get(cod).setLimite(s.nextDouble());
                            break;
                        case 3:
                            System.out.println("Novo Endereço: ");
                            cliente.get(cod).setEndereco(s.next());
                            break;
                    }
                } while (op != 4);
                s.equals("n");
            } else {
                System.out.println("Cliente não existe!");
                System.out.println("Deseja passar outro codigo ? <s/n>: ");
                s.next();
            }
        } while (s.equals("n"));

    }

    public void Pesquisar(Scanner s) {
        do {
            System.out.println("******* Pesquisar cliente *******");
            System.out.println("Digite as informações do Cliente: ");
            System.out.println("Codigo: ");
            int cod = s.nextInt();
            if (cliente.get(cod) != null) {
                System.out.println("******* Cliene Encontrado *******");
                System.out.println("Codigo: " + cliente.get(cod).getCodigo());
                System.out.println("Nome: " + cliente.get(cod).getNome());
                System.out.println("Telefone: " + cliente.get(cod).getTelefone());
                System.out.println("Endereco: " + cliente.get(cod).getEndereco());
                System.out.println("Limite: " + cliente.get(cod).getLimite());
                System.out.println("Qtd Pedidos: " + cliente.get(cod).getPedidos().size());
                s.equals("n");
            } else {
                System.out.println("Cliente não existe!");
                System.out.println("Deseja passar outro codigo ? <s/n>: ");
                s.next();
            }
        } while (s.equals("n"));
    }

    public void Listar(Scanner s) {
        System.out.println("******* Lista de Clientes *******");
        for (Cliente c : cliente) {
            System.out.println("_______________________");
            System.out.println("Codigo: " + c.getCodigo());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("Endereco: " + c.getEndereco());
            System.out.println("Limite: " + c.getLimite());
            System.out.println("Qtd Pedidos: " + c.getPedidos().size());
            System.out.println("_______________________");
        }
    }

}
