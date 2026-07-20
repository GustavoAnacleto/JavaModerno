public class CaixaGenerica<T> {
	private T coisaNaCaixa;

	public void guardar(T coisa) {
		coisaNaCaixa = coisa;
	}
	public T pegar() {
		return coisaNaCaixa;
	}
	public static void main(String[] args) {

	CaixaGenerica<Carrinho> caixaCarrinhos = new CaixaGenerica<>();

	caixaCarrinhos.guardar(new Carrinho("Nascar"));

	CaixaGenerica<Boneca> caixaBonecas = new CaixaGenerica<>();

	caixaBonecas.guardar(new Boneca("Branca de neve"));	

	Carrinho carrinho = caixaCarrinhos.pegar();
	Boneca boneca = caixaBonecas.pegar();

	System.out.println(carrinho.getModelo());
	System.out.println(boneca.getNome());
		
	}
}