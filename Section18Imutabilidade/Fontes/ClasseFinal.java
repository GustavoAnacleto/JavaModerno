final class ClassePai {

	 void meuMetodo(){
		System.out.println("metodo da classe pai");
	}
}

class ClasseFilho extends ClassePai {

	@Override
	 void meuMetodo(){
		System.out.println("metodo da classe filho");
	}
}

public class ClasseFinal {
	public static void main(String[] args) {
		ClasseFilho filho = new ClasseFilho();

		filho.meuMetodo();
	}
}

/*ESSE PROGRAMA NAO COMPILA PARA MOSTRAR QUE QUANDO UMA CLASSE É FINAL ELA NÃO 
PODE SER EXTENDIDA	*/