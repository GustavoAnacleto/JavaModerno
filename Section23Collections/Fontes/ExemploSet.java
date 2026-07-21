import java.util.Set;
import java.util.HashSet;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();

		conjunto.add("Java");
		conjunto.add("C++");
		conjunto.add("Python");

		System.out.println("Verificando se um elemento existe: " + conjunto.contains("C++"));
		System.out.println("_____________________________________________________________");
		System.out.println("Verificando se um elemento existe: " + conjunto.contains("Cachorro"));
		System.out.println("_____________________________________________________________");
		
		conjunto.add("Progress4GL");
		conjunto.add("PHP");

		System.out.println("Conjunto completo: " + conjunto + 
						   "\nUsando size: " + conjunto.size());

		System.out.println("_____________________________________________________________");

		conjunto.remove("Python");

		System.out.println("Conjunto completo depois de remover: " + conjunto + 
				           "\nUsando size: " + conjunto.size());

		System.out.println("_____________________________________________________________");

		boolean foiAdicionado = conjunto.add("PHP");

		System.out.println("Var de elemento repetido: " + foiAdicionado);

		System.out.println("_____________________________________________________________");

		for(String elemento : conjunto){
			System.out.println(elemento + "\n");
		}
		System.out.println("_____________________________________________________________");
		
		conjunto.clear();
		System.out.println("Conjunto completo: " + conjunto + 
						   "\nUsando size: " + conjunto.size());
		System.out.println("_____________________________________________________________");
		
		conjunto.isEmpty();


		System.out.println("verificando se realmente está vazio: " +	conjunto.isEmpty());
	}
}

