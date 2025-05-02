package br.com.cadastro;

//Classe Cliente herdado de Pessoa:
public class Cliente extends Pessoa {
    private final String email;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
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
