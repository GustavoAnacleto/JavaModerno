class Animal2{

	public void fazerSom(){
		System.out.println("O animal faz um som");


	}
}

class Cachorro2 extends Animal2{
	public void fazerSom(){

		System.out.println("o cachorro late");

	}
}

public class TestHeranca2{
	public static void main(String[] args) {
		Cachorro2 dog = new Cachorro2();

		dog.fazerSom();
	}
}