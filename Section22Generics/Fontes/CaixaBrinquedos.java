public class CaixaBrinquedos {
	private Object coisaNaCaixa;

	public void guardar(Object coisa) {
		coisaNaCaixa = coisa;
	}

	public Object pegar() {
		return coisaNaCaixa;
	}

	public static void main(String[] args) {
		CaixaBrinquedos caixaCarrinhos = new CaixaBrinquedos();
		caixaCarrinhos.guardar(new Carrinho("Hot Wheesl"));

		CaixaBrinquedos caixaBonecas = new CaixaBrinquedos();
		caixaBonecas.guardar(new Boneca("Barbie"));

		if(caixaCarrinhos.pegar() instanceof Carrinho) {
			Carrinho carrinho = (Carrinho) caixaCarrinhos.pegar();
			System.out.println(carrinho.getModelo());
		}

		if(caixaBonecas.pegar() instanceof Boneca) {
			Boneca boneca = (Boneca) caixaBonecas.pegar();
			System.out.println(boneca.getNome());
		}
	}
}