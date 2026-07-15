package entidades;

public class Onibus extends Veiculo{

	private int acentos;

	public Onibus(String placa, int ano, int acentos){
		super(placa, ano);
		this.acentos = acentos;
	}

	@Override
	public void exibirInformacoes(){
		System.out.println("Placa Onibus: " + getPlaca() + 
			"\nAno carro: " + getAno() + 
			"\nAcentos: " + getAcentos());
	}

	public int getAcentos(){
		return acentos;
	}


}