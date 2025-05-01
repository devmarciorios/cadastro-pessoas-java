package br.com.cadastro;

public class Cliente extends Pessoa implements Pagavel{
    private String email;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    @Override
    public void pagar() {
        System.out.println(nome + " realizou um pagamento como cliente.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", idade" + idade + ", Email: " + email);
    }

    @Override
    public String toString() {
        return super.toString() + ", email: " + email;
    }
}
