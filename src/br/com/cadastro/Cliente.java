package br.com.cadastro;

//Classe Cliente herdado de Pessoa e implementando Pagavel:
public class Cliente extends Pessoa implements Pagavel{
    private final String email;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    //Método para verificação de idade mínima para a realização do cadastro:
    public boolean validarIdade() {
        return idade >= 18;
    }

    //Output de pagamento do Cliente
    @Override
    public void pagar() {
        System.out.println(nome + " realizou um pagamento como cliente.");
    }

    //Output de informações do Cliente
    @Override
    public String exibirInfo() {
        return super.exibirInfo() + ", Email: " + email;
    }

    //Override para subscrição em texto do email:
    @Override
    public String toString() {
        return super.toString() + ", email: " + email;
    }
}
