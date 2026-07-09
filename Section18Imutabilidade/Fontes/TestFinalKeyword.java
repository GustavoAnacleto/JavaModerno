class ExemploFinal{

	//Definição de constante e uso do final

	public final int CODIGO_FIXO = 10;

	public final void meuMetodo(){
		System.out.println("Este é um método final.");
	}
}

public class TestFinalKeyword {
	public static void main(String[] args) {
		ExemploFinal testFinal = new ExemploFinal();
		System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);

		testFinal.meuMetodo();
	}
}