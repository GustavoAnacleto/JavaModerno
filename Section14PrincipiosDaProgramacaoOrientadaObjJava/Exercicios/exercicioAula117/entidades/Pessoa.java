package entidades;

public class Pessoa{

	public String nome;
	private int idade;
	protected String endereco;
	int telefone;

	public int getIdade(){
		return idade;
	}

	public String getEndereco(){
		return endereco;
	}

	public int getTelefone(){
		return telefone;
	}

	public void setIdade(int novaIdade){

		idade = novaIdade;

	}

	public void setEndereco(String novoEndereco){

		endereco = novoEndereco;
	}

	public void setTelefone(int novoTelefone){

		telefone = novoTelefone;
	}
}