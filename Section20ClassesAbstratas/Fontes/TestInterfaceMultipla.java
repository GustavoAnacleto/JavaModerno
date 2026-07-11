interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}

interface Interface3 extends Interface1, Interface2 {
    void metodo3();
}

interface Interface4 {
    void metodo4();
}


abstract class ClasseExemplo implements Interface3, Interface4 {
    @Override
    public void metodo1() {
        System.out.println("Método 1");
    }

    @Override
    public void metodo2() {
        System.out.println("Método 2");
    }
    @Override
    public void metodo3() {
        System.out.println("Método 3");
    }
    @Override
    public void metodo4() {
        System.out.println("Método 4");
    }
}

public class TestInterfaceMultipla extends ClasseExemplo {
    
    public static void main(String[] args) {
    	TestInterfaceMultipla test = new TestInterfaceMultipla();
    	test.metodo1();
    	test.metodo2();
        test.metodo3();
        test.metodo4();
    }
}
