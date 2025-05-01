package br.com.cadastro;

public class Main {
    public static void main(String[] args) {

        //Instanciando cliente e funcionário:
        Cliente cliente1 = new Cliente("Marcio", 35, "marcio@gmail.com");
        Funcionario funcionario1 = new Funcionario("Luciana", 42, "Radioterapeuta");

        //Exibir informações:
        cliente1.exibirInfo();
        funcionario1.exibirInfo();

        //Método pagar:
        cliente1.pagar();
        funcionario1.pagar();
    }
}
