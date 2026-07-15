abstract class Animal {
	public abstract void fazerSom();

	public void tipoObjeto(){
		System.out.println("É um animal mamífero!");
	}
}

class Cachorro extends Animal { //Subclasse Cachorro
	public void fazerSom(){
		System.out.println("O cachorro late");
	}
}

class Gato extends Animal { //Subclasse Gato
	public void fazerSom(){
		System.out.println("O Gato Mia");
	}
}

public class TestPolimorfismo {
	public static void main(String[] args) {
		// Criando objetos polimórficos

		Animal meuCachorro = new Cachorro();
		Animal meuGato     = new Gato();

		meuGato.fazerSom();
		meuCachorro.fazerSom();

		meuGato.tipoObjeto();
		meuCachorro.tipoObjeto();
		
	}
}