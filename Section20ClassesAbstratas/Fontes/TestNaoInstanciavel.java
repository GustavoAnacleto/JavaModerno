abstract class Animal {
    abstract void fazerSom(String som);
}

public class TestNaoInstanciavel {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.fazerSom("AU AU!");
    }
}

//Retorno do terminal objetivo mostrar regra 01
/*
C:\Curso_Java\JavaModerno\Section20ClassesAbstratas\Fontes>javac TestNaoInstanciavel.java
TestNaoInstanciavel.java:7: error: Animal is abstract; cannot be instantiated
        Animal dog = new Animal();
                     ^
1 error

O compilador recusou a linha Animal dog = new Animal(); com a mensagem "Animal is abstract;
cannot be instantiated", confirmando na prática que uma classe abstrata não pode ser 
instanciada diretamente, mesmo que ela tenha uma sintaxe parecida com qualquer outra classe.
*/