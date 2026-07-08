class Animal { 
    public void fazerSom() { 
        System.out.println("O animal faz um som"); 
    } 
} 


class Cachorro extends Animal {

    @Override
    public void fazerSom() { 
        System.out.println("O cachorro late"); 
    }  
} 


public class TestAnnotations {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro ();
        dog.fazerSom();
    }
}