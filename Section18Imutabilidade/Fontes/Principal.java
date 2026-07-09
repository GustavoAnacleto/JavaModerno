class ClassePai {
	final void meuMetodo(){
		System.out.println("metodo da classe pai");
	}
}

class ClasseFilho extends ClassePai {

	@Override
	final void meuMetodo(){
		System.out.println("metodo da classe filho");
	}
}

public class Principal {
	public static void main(String[] args) {
		ClasseFilho filho = new ClasseFilho();

		filho.meuMetodo();
	}
}

/*	ESSE PROGRAMA NÃO COMPILA PARA MOSTRAR O EXEMPLO DE COMO NÃO É POSSÍVEL SOBREESCREVER 
METÓDOS CRIADOS COM FINAL.*/