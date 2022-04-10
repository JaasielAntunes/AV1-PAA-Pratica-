package insertionsort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		System.out.println("=======INSERTION SORT=======" + "\n");

		int[] numeros = {10, 6, 15, 4, 1, 22};
		InsertionSort is = new InsertionSort();

		System.out.println("Lista desordenada: " + Arrays.toString(numeros) + "\n");
		is.insertionSort(numeros);

		System.out.print("Lista ordenada: \n");
		is.imprimir(numeros);

	}
}
