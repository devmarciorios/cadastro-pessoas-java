package br.com.cadastro;

//Classe Funcionário herdada de Pessoa e implementando Pagavel
public class Funcionario extends Pessoa implements Pagavel {

    private final String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    //Output de pagamento do funcionário:
    @Override
    public void pagar() {
        System.out.println(nome + " recebeu pagamento como funcionário.");
    }

    //Output de informações do funcionário:
    @Override
    public String exibirInfo() {
        return super.exibirInfo() + ", Cargo: " + cargo;
    }

    //Override para subscrição em texto do cargo:
    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo;
    }
}
