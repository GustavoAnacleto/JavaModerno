class InformaRegras{
	@Deprecated
	public void mostrarRegrasParaAposentadoria(){

		System.out.println("Regras para aposentadoria");
	}

	public void mostrarNovasRegrasParaAposentadoria(){
		System.out.println("Novas regras para aposentadoria");
	}
}

public class Previdencia{
	public static void main(String[] args) {
		InformaRegras regras = new InformaRegras();

		//uso de método obsoleto(deprecated)

		regras.mostrarRegrasParaAposentadoria();

		//uso do novo método

		regras.mostrarNovasRegrasParaAposentadoria();
	}
}