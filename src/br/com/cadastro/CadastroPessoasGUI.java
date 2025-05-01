package br.com.cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroPessoasGUI {

    //Instância da lista Clientes e Funcionários:
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void main(String[] args) {

        //Criando a janela de interface do usuário:
        JFrame frame = new JFrame("Sistema de cadastro para Clientes e Funcionários");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(4, 1));

        //Criando os botões da janela:
        JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
        JButton btnListarPessoas = new JButton("Listar Pessoas");
        JButton btnSair = new JButton("Sair");

        //Adicionando os botões na janela:
        frame.add(btnCadastrarCliente);
        frame.add(btnCadastrarFuncionario);
        frame.add(btnListarPessoas);
        frame.add(btnSair);

        //Ação dos botões:
        btnCadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = JOptionPane.showInputDialog(frame, "Digite o nome: ");
                    String email = JOptionPane.showInputDialog(frame, "Digite o email: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite a idade"));

                    if (idade < 18) {
                        JOptionPane.showMessageDialog(frame, "Erro: Cadastro disponível somente para usuários maiores de 18 anos.");
                        return;
                    }

                    Cliente novoCliente = new Cliente(nome, idade, email);
                    listaClientes.add(novoCliente);
                    JOptionPane.showMessageDialog(frame, "Cliente cadastrado com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro: idade inválida, digite o número da sua idade.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Erro inesperado: " + ex.getMessage());
                }
            }
        });

        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = JOptionPane.showInputDialog(frame, "Digite o nome: ");
                    String email = JOptionPane.showInputDialog(frame, "Digite o email: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite a idade"));

                    if (idade < 18) {
                        JOptionPane.showMessageDialog(frame, "Erro: Cadastro disponível somente para usuários maiores de 18 anos.");
                        return;
                    }

                    Funcionario novoFuncionario = new Funcionario(nome, idade, email);
                    listaFuncionarios.add(novoFuncionario);
                    JOptionPane.showMessageDialog(frame, "Funcionário cadastrado com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro: idade inválida, digite o número da sua idade.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Erro inesperado: " + ex.getMessage());
                }
            }
        });

        btnListarPessoas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder lista = new StringBuilder();

                lista.append("- Clientes - \n");
                if (listaClientes.isEmpty()) {
                    lista.append("Nenhum cliente cadastrado. \n");
                } else {
                    for (Cliente c : listaClientes) {
                        lista.append(c.exibirInfo()).append("\n");
                    }
                }

                lista.append("- Funcionários - \n");
                if (listaFuncionarios.isEmpty()) {
                    lista.append("Nenhum funcionário cadastrado.");
                } else {
                    for (Funcionario f : listaFuncionarios) {
                        lista.append(f.exibirInfo()).append("\n");
                    }
                }

                JOptionPane.showMessageDialog(frame, lista.toString());
            }
        });

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        //Tornar a janela visível:
        frame.setVisible(true);
    }
}
