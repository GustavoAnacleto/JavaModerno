package entidades;

public class Carro{

	private String marca;
	private String modelo;
	private int ano;

	public Carro(){
		marca = "Desconhecida";
		modelo = "desconhecido";
		ano = 0;
	}

	public Carro(String marcaInit, String modeloInit){
		marca = marcaInit;
		modelo = modeloInit;
		ano = 0;
	}

	public Carro(String marcaInit, String modeloInit, int anoInit){
		marca = marcaInit;
		modelo = modeloInit;
		ano = anoInit;
	}

	public void exibirDetalhes(){
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println();

	}


}