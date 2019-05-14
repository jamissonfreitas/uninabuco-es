package estruturas;

public class Test {

	public static void main(String[] args) {
		Arvore a = new Arvore();
		a.inserir(7, true);
		a.inserir(0, true);
		a.inserir(1, true);
		a.inserir(13, true);
		a.inserir(2, true);
		a.inserir(23, true);
		a.inserir(17, true);
		a.imprimir(true);
		System.out.println();
		
		Arvore a2 = new Arvore();
		a2.inserir(7, false);
		a2.inserir(0, false);
		a2.inserir(1, false);
		a2.inserir(13, false);
		a2.inserir(2, false);
		a2.inserir(23, false);
		a2.inserir(17, false);
		a2.imprimir(true);
		
		System.out.println();
		System.out.println("a é binaria de busca? " + Arvore.ehBinariaBusca(a));
		System.out.println("a2 é binaria de busca? " + Arvore.ehBinariaBusca(a2));
		
	}

}
