public class SobrecargaConstrutores{

	//aqui cria-se as var membros ou seja os atributos das classes!

	int id;
	String nome;
	String marca;
	String modelo;
	int ano;

	SobrecargaConstrutores(int idInit, String nomeInit, String marcaInit, String modelo, int ano){
		id = idInit;
		nome = nomeInit;
		marca = marcaInit;
		this.modelo = modelo;
		this.ano = ano;
		/*Aqui para entender melhor eu coloquei tanto o nome da var local diferente quanto igual sabendo que 
		quando igual o uso da palavra this se torna necessario para referenciar o atributo da classe.*/
	}

		SobrecargaConstrutores(String modelo, int ano){
		this.modelo = modelo;
		this.ano = ano;
		/*Aqui eu crie o construtor para a necessidade do cliente em cadastrar o modelo e o ano do carro que 
		ele queira comprar sem os demais atrinutos */
	}

		SobrecargaConstrutores(){
		/*Aqui criei o construtor vazio para caso necessite criar e declarar o objeto manipulando diretamente*/
	}

	public static void main(String[] args) {

		

		SobrecargaConstrutores carroArgo = new SobrecargaConstrutores(1001, "Carlos Nascimento", "Fiat", "Fiat Argo", 2024);

		SobrecargaConstrutores carroCelta = new SobrecargaConstrutores(1002, "Danilo Silva", "Chevrolet", "Celta", 2023);

		//SobrecargaConstrutores carroHb20 = new SobrecargaConstrutores(1003, "HB20", 2025);

		/*Essa linha acima mostra que se colocar parametros precisa bater exaatamente com um construtor 
		pré existente não se pode misturar o construtor vazio com o segunda e tentar criar o objeto com 3
		parametros usando dois do contrutor e o id do vazio */

		SobrecargaConstrutores carroHb20 = new SobrecargaConstrutores("HB20", 2025);


		System.out.println(carroArgo.nome);
		System.out.println(carroCelta.nome);
		System.out.println(carroHb20.ano);

		/*Aqui eu tentei imprimir o obj inteiro mas quando eu nao identifico o atributo que quero o sistema retorna apenas o endereço de memoria onde 
		foi criado o obj. depois coloquei o .nome e  apareceu*/



		
	}
}