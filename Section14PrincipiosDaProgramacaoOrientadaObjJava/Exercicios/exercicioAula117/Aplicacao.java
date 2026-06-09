import entidades.Pessoa;

import entidades.Pessoa;

public class Aplicacao {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Gustavo";
        p1.setIdade(25);
        p1.setEndereco("Rua das Flores, 100");
        p1.setTelefone(999999999);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());
    }
}