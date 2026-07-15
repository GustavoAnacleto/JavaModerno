package entidades;

public class Soma extends Operacao {

	@Override
	public double calcular(double numeroA, double numeroB){
		return numeroA + numeroB;
	}
}