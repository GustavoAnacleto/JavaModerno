abstract class Funcionario {
    String nome;
    double salarioBase;

    // Construtor da classe abstrata
    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        System.out.println("Construtor de Funcionario executado para: " + nome);
    }

    abstract void calcularSalario();
}

class Vendedor extends Funcionario {
    double comissao;

    // Construtor da subclasse concreta
    Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase); // chama o construtor da classe abstrata
        this.comissao = comissao;
        System.out.println("Construtor de Vendedor executado.");
    }

    @Override
    void calcularSalario() {
        double total = salarioBase + comissao;
        System.out.println(nome + " receberá: R$ " + total);
    }
}

public class TestConstrutorAbstrato {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, 500.0);
        vendedor.calcularSalario();
    }
}

//Regra 03
/*
Saída do terminal:

C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>javac TestConstrutorAbstrato.java

C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>java TestConstrutorAbstrato
Construtor de Funcionario executado para: Carlos
Construtor de Vendedor executado.
Carlos receberá: R$ 2500.0 
*/