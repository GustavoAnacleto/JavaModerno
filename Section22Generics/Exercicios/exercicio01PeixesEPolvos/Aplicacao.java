import entidades.*;

public class Aplicacao {

	public static void main(String[] args) {

		Cesto<Peixe> peixe = new Cesto<>();

		peixe.guardar(new Peixe("Manjuba", 15));

		Cesto<Polvo> polvo = new Cesto<>();

		polvo.guardar(new Polvo("Azul", 8));

		Peixe objPeixe = peixe.pegar();
		Polvo objPolvo = polvo.pegar();

		System.out.println("O peixe " + objPeixe.getNome() 
			+ " tem " + objPeixe.getTamanho() + " centimetros.");

		System.out.println("O polvo " + objPolvo.getNome() 
			+ " tem " + objPolvo.getTentaculos() + " tentaculos.");


		/*System.out.println("O peixe " + peixe.getNome() 
			+ " tem " + peixe.getTamanho() + " centimetros.");*/ //isso nao compila porque peixe é Cesto
	}
}