class Animal4{
	String nome;

	Animal4(String nome){
		this.nome = nome;
	}
}

class Cachorro4 extends Animal4{
	String raca;

	Cachorro4(String nome, String raca){
		super(nome);
		this.raca = raca;
	}
}

public class TestHeranca4{
	public static void main(String[] args) {
		Cachorro4 dog = new Cachorro4("Rex", "Labrador");

		System.out.println("O nome do animal: " + dog.nome);
		System.out.println("A raça do animal: " + dog.raca);
	}
}