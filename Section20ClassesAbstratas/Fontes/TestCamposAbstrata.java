// Classe abstrata: não pode ser instanciada diretamente (Regra 1)
abstract class ContaBancaria {
    String titular;
    double saldo; // Campos definidos na própria classe abstrata (Regra 4)

    // Construtor da classe abstrata (Regra 3): será chamado via super() pelas subclasses
    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método concreto (Regra 2): já vem pronto e é herdado por qualquer subclasse
    void depositar(double valor) {
        saldo += valor;
        System.out.println(titular + " depositou R$ " + valor + 
            ". Saldo atual: R$ " + saldo);
    }

    // Método abstrato (Regra 2): cada subclasse decide como implementar
    abstract void aplicarRendimento();
}

// Subclasse concreta: obrigada a implementar aplicarRendimento()
class ContaPoupanca extends ContaBancaria {
    double taxaJuros; // Campo específico dessa subclasse, além dos herdados

    ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo); // Chama o construtor da classe abstrata
        this.taxaJuros = taxaJuros;
    }

    @Override
    void aplicarRendimento() {
        double rendimento = saldo * taxaJuros;
        saldo += rendimento;
        System.out.println(titular + " (Poupança) rendeu R$ " + rendimento + 
            ". Novo saldo: R$ " + saldo);
    }
}

// Outra subclasse concreta, com sua própria regra de rendimento
class ContaInvestimento extends ContaBancaria {
    double taxaRisco;

    ContaInvestimento(String titular, double saldo, double taxaRisco) {
        super(titular, saldo);
        this.taxaRisco = taxaRisco;
    }

    @Override
    void aplicarRendimento() {
        double rendimento = saldo * taxaRisco;
        saldo += rendimento;
        System.out.println(titular + " (Investimento) rendeu R$ " + rendimento + 
            ". Novo saldo: R$ " + saldo);
    }
}

public class TestCamposAbstrata {
    public static void main(String[] args) {
        /* Instanciando as subclasses concretas (a classe abstrata em si não pode ser 
        instanciada) */
        ContaPoupanca poupanca = new ContaPoupanca("Ana", 1000.0, 0.01);
        ContaInvestimento investimento = new ContaInvestimento("Bruno", 5000.0, 0.03);

        /* depositar() é herdado sem alterações; aplicarRendimento() é específico 
        de cada conta */
        poupanca.depositar(200.0);
        poupanca.aplicarRendimento();

        investimento.depositar(1000.0);
        investimento.aplicarRendimento();
    }
}
//Regra 04

/*
Retorno do terminal:

C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>javac TestCamposAbstrata.java

C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>java TestCamposAbstrata
Ana depositou R$ 200.0. Saldo atual: R$ 1200.0
Ana (Poupança) rendeu R$ 12.0. Novo saldo: R$ 1212.0
Bruno depositou R$ 1000.0. Saldo atual: R$ 6000.0
Bruno (Investimento) rendeu R$ 180.0. Novo saldo: R$ 6180.0

*/