// Interfaces definem apenas o "contrato", sem implementação
interface Motorista {
    void dirigir();
}

interface Digitador {
    void digitar();
}

// Classe abstrata implementando duas interfaces ao mesmo tempo (Regra 5)
abstract class Funcionario implements Motorista, Digitador {
    String nome;

    // Construtor da classe abstrata (Regra 3): será chamado via super() pela subclasse
    Funcionario(String nome) {
        this.nome = nome;
    }

    // Método abstrato (Regra 2): cada subclasse define seu próprio comportamento
    abstract void trabalhar();
}

// Subclasse concreta: obrigada a implementar dirigir(), digitar() e trabalhar()
class Motorista_Escritorio extends Funcionario {

    Motorista_Escritorio(String nome) {
        super(nome); // Chama o construtor da classe abstrata
    }

    // Implementação exigida pela interface Motorista
    @Override
    public void dirigir() {
        System.out.println(nome + " está dirigindo o carro da empresa.");
    }

    // Implementação exigida pela interface Digitador
    @Override
    public void digitar() {
        System.out.println(nome + " está digitando um relatório.");
    }

    @Override
    void trabalhar() {
        System.out.println(nome + " começou o expediente.");
    }
}

public class TestAbstractInterface {
    public static void main(String[] args) {
        // Instanciando a subclasse concreta (a classe abstrata não pode ser instanciada)
        Motorista_Escritorio joao = new Motorista_Escritorio("João");
        joao.trabalhar();

        /* O mesmo objeto pode ser referenciado como Motorista ou como Digitador,
        já que Funcionario implementa as duas interfaces (herança múltipla de tipo) */
        Motorista comoMotorista = joao;
        Digitador comoDigitador = joao;

        comoMotorista.dirigir();
        comoDigitador.digitar();
    }
}

//regra 05

/*
Esse código ilustra a regra 5 da página 2 do PDF: uma classe abstrata pode implementar 
interfaces. A classe abstrata Funcionario implementa ao mesmo tempo as interfaces Motorista 
e Digitador, algo que só é possível com implements, já que uma classe em Java só pode 
estender uma única classe (extends), mas pode implementar quantas interfaces quiser.

A subclasse concreta Motorista_Escritorio é obrigada a implementar os métodos dirigir() 
e digitar(), exigidos pelas duas interfaces, além do método abstrato trabalhar() 
da própria classe Funcionario. No main(), o objeto joao é referenciado tanto como 
Motorista quanto como Digitador, mostrando que um mesmo objeto pode assumir múltiplos 
"tipos" quando sua classe implementa várias interfaces, conforme os pontos discutidos 
na página 3 do PDF sobre herança múltipla de tipo.

Saída do terminal:

C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>javac TestAbstractInterface.java

C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>java TestAbstractInterface
João começou o expediente.
João está dirigindo o carro da empresa.
João está digitando um relatório.

*/