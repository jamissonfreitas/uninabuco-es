package busca;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		int[] v = new int[100];
		
		for(int i =0; i< v.length; i++) {
			v[i] = i;
		}
		
		System.out.println(v);
		
		System.out.println(Arrays.toString(v));
		
		int valor_busca = 1;
		
		int index = BuscaBinaria.search(v, valor_busca);
		System.out.println("Index encontrado: " + index);
	}

}
