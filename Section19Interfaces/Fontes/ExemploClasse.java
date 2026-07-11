interface ExemploInterfaceEspecial {
    void metodoAbstrato(); 
    /*método abstrato: não tem corpo e termina com ; toda classe que implementa
    essa interface é obrigada a fornecer sua própria implementação. Pode ter
    parâmetros normalmente, isso não é uma regra fixa desse tipo de método.*/

    default void metodoDefault(){
        System.out.println("Este é um método default na interface.");
    }
    /*método default: já vem com uma implementação pronta na própria interface.
    Toda classe que implementa herda esse comportamento automaticamente, sendo
    opcional sobrescrevê-lo com @Override caso precise de um comportamento diferente.*/

    static void metodoStatic(){
        System.out.println("Esta é método static na interface.");
    }
    /*método static: pertence exclusivamente à interface, não é herdado pelas
    classes que a implementam e não pode ser sobrescrito. Deve ser chamado
    diretamente pelo nome da interface, ex: ExemploInterfaceEspecial.metodoStatic().*/
}

class ExemploClasse implements ExemploInterfaceEspecial {
	public void metodoAbstrato(){
		System.out.println("Implementação de método abstrato");
	}

	public static void main(String[] args) {
		ExemploClasse exemplo = new ExemploClasse();

		exemplo.metodoAbstrato();
		exemplo.metodoDefault();
		ExemploInterfaceEspecial.metodoStatic();
	}
}