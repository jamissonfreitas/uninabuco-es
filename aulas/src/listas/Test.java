package listas;

public class Test {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		System.out.println("Est� vazia? " + lista.estaVazia());
		lista.adicionar(67);
		System.out.println("Est� vazia? " + lista.estaVazia());
		lista.adicionar(23);
		lista.adicionar(8);
		lista.adicionar(0);
		lista.adicionar(111);
		lista.print();
	}

}
