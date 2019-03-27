package busca;

public class BuscaBinaria {
	
	private static int search(int[] vetor, int valor, int index_inicio, int index_fim) {
		int pivot = (index_fim + index_inicio)/2;
		System.out.println("Pivot = " + pivot);
		if(vetor[pivot] == valor)
			return pivot;
		if(vetor[pivot] < valor)
			return search(vetor, valor, pivot+1, index_fim);
		if(vetor[pivot] > valor)
			return search(vetor, valor, index_inicio, pivot-1);
		return -1;
	}

	public static int search(int[] vetor, int valor) {
		return search(vetor, valor, 0, vetor.length-1);
	}
}
