package entidades;

public class Onibus extends Veiculo{

	private int assentos;

	public Onibus(String placa, int ano, int assentos){
		super(placa, ano);
		this.assentos = assentos;
	}

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Assentos: " + assentos);
    }

	public int getAssentos(){
		return assentos;
	}


}