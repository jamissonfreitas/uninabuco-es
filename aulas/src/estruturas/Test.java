package estruturas;

public class Test {

	public static void main(String[] args) {
		Arvore a = new Arvore();
		
		a.inserir(4);
		a.inserir(7);
		a.inserir(5);
		a.inserir(3);
		a.inserir(69);
		a.inserir(11);
		a.inserir(0);
		a.inserir(1);
		a.inserir(8);
		
		a.imprimir(false);
		
	}

}
