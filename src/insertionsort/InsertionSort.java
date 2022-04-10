package insertionsort;

public class InsertionSort {

	/*

	- Na implementação deste código podemos observar que a ordenação começa a partir do 2º elemento do array (variável de loop
	j = 1) e então o elemento atual é comparado com todos os seus elementos anteriores. O elemento é então colocado em sua posição correta.

	- A classificação por inserção funciona efetivamente para matrizes menores e para matrizes parcialmente classificadas onde
	a classificação é concluída em menos passagens.

	- A ordenação por inserção é uma ordenação estável, ou seja, mantém a ordem dos elementos iguais na lista.

	 */

	public void insertionSort(int[] vetor) {

		for (int i = 1; i < vetor.length - 1; i++) {
			int temp = vetor[i];
			int j = i - 1;

			while (j >= 0 && temp <= vetor[j]) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}

			vetor[j + 1] = temp;
		}
	}

	public void imprimir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}
}
