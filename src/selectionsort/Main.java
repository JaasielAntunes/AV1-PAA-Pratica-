package selectionsort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		System.out.println("=======SELECTION SORT=======" + "\n");

		int[] numeros = {9, 14, 3, 2, 40, 10};
		SelectionSort ss = new SelectionSort();

		System.out.println("Lista desordenada: " + Arrays.toString(numeros) + "\n");
		ss.selectionSort(numeros);

		System.out.print("Lista ordenada: \n");
		ss.imprimir(numeros);

	}
}
