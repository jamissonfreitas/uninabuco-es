package estruturas;

public class Arvore {
	
	private NoArvore raiz;
	
	public Arvore() {}
	
	public Arvore(int key) {
		this.raiz = new NoArvore(key, key);
	}
	
	public boolean ehVazia() {
		return this.raiz == null;
	}
	
	private NoArvore inserirNoArvoreBinaria(NoArvore corrente, int key) {
		if(corrente == null) {
			corrente = new NoArvore(key);
		} else {
			if(key < corrente.getChave()) {
				NoArvore esquerda = inserirNoArvoreBinaria(corrente.getEsquerda(), key);
				corrente.setEsquerda(esquerda);
			}
			else {
				NoArvore direita = inserirNoArvoreBinaria(
						corrente.getDireita(), key);
				corrente.setDireita(direita);
			}
		}
		return corrente;
	}
	
	private NoArvore inserirNoArvore(NoArvore corrente, int key) {
		if(corrente == null) {
			corrente = new NoArvore(key);
		} else {
			double random = Math.random();
			if(random < 0.5) {
				NoArvore esquerda = inserirNoArvore(corrente.getEsquerda(), key);
				corrente.setEsquerda(esquerda);
			}
			else {
				NoArvore direita = inserirNoArvore(
						corrente.getDireita(), key);
				corrente.setDireita(direita);
			}
		}
		return corrente;
	}
	
	public void inserir(int key, boolean binaria) {
		if(binaria)
			this.raiz = inserirNoArvoreBinaria(this.raiz, key);
		else
			this.raiz = inserirNoArvore(this.raiz, key);
	}
	
	private void imprimirNoArvore(NoArvore no, int nivel) {
		if(no != null) {
			System.out.print(new String(new char[nivel]).replace("\0", "-"));
			System.out.println(no.getChave() + " ");
			imprimirNoArvore(no.getEsquerda(), nivel+1);
			imprimirNoArvore(no.getDireita(), nivel+1);
		}
	}
	
	private void imprimirNoArvoreOrdenado(NoArvore no) {
		if(no != null) {
			imprimirNoArvoreOrdenado(no.getEsquerda());
			System.out.print(no.getChave() + " ");
			imprimirNoArvoreOrdenado(no.getDireita());
		}
	}
	
	public void imprimir(boolean ordenado) {
		if (ordenado)
			imprimirNoArvoreOrdenado(this.raiz);
		else
			imprimirNoArvore(this.raiz, 0);
	}

	public NoArvore getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore raiz) {
		this.raiz = raiz;
	}
	
	public static boolean ehBinariaBusca(Arvore arvore) {
		return false;
	}

}
