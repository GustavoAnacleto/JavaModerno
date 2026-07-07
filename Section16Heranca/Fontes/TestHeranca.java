class Animal{

	public void comer(){
		System.out.println("O animal comeu");


	}
}

class Cachorro extends Animal{
	public void latir(){

		System.out.println("o cachorro latiu");

	}
}

public class TestHeranca{
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();

		dog.latir();
		dog.comer();
	}
}