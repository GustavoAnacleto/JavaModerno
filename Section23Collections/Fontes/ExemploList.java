import java.util.*;

public class ExemploList {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Java");
		lista.add("Python");
		lista.add("C++");

		//Verificando se a lista contém um elemento 
		System.out.println("Contém 'Java': " + lista.contains("Java"));

		//Adicionando todos os elementos em outra lista
		List<String> outraLista = Arrays.asList("JS", "Ruby");
		lista.addAll(outraLista);

		//imprimir --> [Java Python C++ JS Ruby]
		System.out.println("Lista completa: " + lista);

		lista.remove("Python");

		System.out.println("Lista completa após remoção: " + lista);

		String elemento = lista.get(2); 
		System.out.println("Elemento no índice 2 " + elemento);

		lista.clear();

		System.out.println("Lista após limpar: " + lista);

	}
}