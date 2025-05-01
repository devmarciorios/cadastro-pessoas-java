package br.com.cadastro;

//Super classe que se extenderá às classes Cliente e Funcionário:
public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Adicionando getters:
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //Método para exibir as informações do usuário:
    public String exibirInfo() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

}
