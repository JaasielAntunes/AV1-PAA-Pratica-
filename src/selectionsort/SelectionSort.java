package selectionsort;

public class SelectionSort {

	/*

	O SelectionSort guarda a posição do menor elemento na variável menorNumero e percorre o vetor procurando por um valor menor.
	Caso este valor seja encontrado então a variável menorNumero recebe a posição deste valor.

	 */

	public void selectionSort(int[] vetor) {

		for (int i = 0; i < vetor.length - 1; i++) {
			int indice = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indice]) {
					indice = j; // procurando o menor indice
				}
			}

			int menorNumero = vetor[indice];
			vetor[indice] = vetor[i];
			vetor[i] = menorNumero;
		}
	}

	public void imprimir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}
}
