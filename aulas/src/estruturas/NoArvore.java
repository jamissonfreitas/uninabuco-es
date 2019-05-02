package estruturas;

public class NoArvore {
	
	private NoArvore esquerda;
	private NoArvore direita;
	private Object valor;
	private int chave;
	
	public NoArvore() {}
	
	public NoArvore(int chave, Object valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public NoArvore(int chave) {
		this.chave = chave;
	}
	
	
	public NoArvore getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(NoArvore esquerda) {
		this.esquerda = esquerda;
	}
	public NoArvore getDireita() {
		return direita;
	}
	public void setDireita(NoArvore direita) {
		this.direita = direita;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}

}
