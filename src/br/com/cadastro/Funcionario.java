package br.com.cadastro;

//Classe Funcionário herdada de Pessoa:
public class Funcionario extends Pessoa {

    private final String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
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
