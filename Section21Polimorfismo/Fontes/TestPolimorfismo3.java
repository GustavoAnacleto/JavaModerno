abstract class Animal {

    public abstract void fazerSom();
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

public class TestPolimorfismo3 {

    public static void main(String[] args) {

        Object meuCachorro = new Cachorro();

        // Conversão armazenada em uma variável
        Cachorro objetoConvertido = (Cachorro) meuCachorro;
        objetoConvertido.fazerSom();

        // Conversão direta, sem criar outra variável
        ((Cachorro) meuCachorro).fazerSom();
    }
}
