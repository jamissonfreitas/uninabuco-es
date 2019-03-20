package listas;

public class Test {

	public static void main(String[] args) {
		
		
		Lista lista = new Lista();
		System.out.println("Está vazia? " + lista.estaVazia());
		lista.adicionar(67);
		System.out.println("Está vazia? " + lista.estaVazia());
		lista.adicionar(23);
		lista.adicionar(8);
		lista.adicionar(0);
		lista.adicionar(111);
		//lista.remove(23); TODO
		lista.print();
		
		
		/*
		NoLista a = new NoLista(2);
		NoLista b = new NoLista(2);
		NoLista c = a;
		
		b.setValor(3);
		System.out.println(c.getValor());
		*/
	
	}

}
