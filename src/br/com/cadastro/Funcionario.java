package br.com.cadastro;

public class Funcionario extends Pessoa implements Pagavel {

    private String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    @Override
    public void pagar() {
        System.out.println(nome + " recebeu pagamento como funcionário.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cargo: " + cargo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo;
    }
}
