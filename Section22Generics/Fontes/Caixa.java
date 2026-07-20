public class Caixa<T> {
	private T coisaNaCaixa;

	public void guardar(T coisa){ //construtor
		coisaNaCaixa = coisa;
	}

	public T pegar(){ //método
		return coisaNaCaixa; // retorna a var tipo T 
	}

	public static void main(String[] args) { //main

		Caixa<String> caixaDeTexto = new Caixa<>(); //instancia o obj como String 
		caixaDeTexto.guardar("Olá, mundo!"); // guarda um valor no obj instanciado acima
		String texto = caixaDeTexto.pegar(); // cria uma var pra receber o valor 
											 //retornado no metodo criado acima 
		System.out.println(texto);  //imprime a var criado acima que recebeu o valor do metodo



		Caixa<Integer> caixaNumeros = new Caixa<>();
		Integer numero =  Integer.valueOf(3);
		caixaNumeros.guardar(numero);

		Integer valorResgatado = caixaNumeros.pegar();										
		System.out.println(valorResgatado); 






 	}
}

