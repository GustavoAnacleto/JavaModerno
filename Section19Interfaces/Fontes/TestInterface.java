interface SerVivo {
	void Respirar(); // método abstrado.
}
interface Animal extends SerVivo {
	String DESC = "Animal é Animal!";
	void fazerSom(); // método abstrado.
}
class Cachorro implements Animal {
	@Override
	public void fazerSom(){
		System.out.println("O cachorro late!");
	}
	@Override
	public void Respirar(){
		System.out.println("Respira normal");
	}
}
class Gato implements Animal {
	@Override
	public void fazerSom(){
		System.out.println("O gato mia!");
	}
	@Override
	public void Respirar(){
		System.out.println("Respira normal");
	}	
}
public class TestInterface {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();

		dog.fazerSom();
		cat.fazerSom();
		System.out.println(Animal.DESC);
		dog.Respirar();
		cat.Respirar();
	}
}

