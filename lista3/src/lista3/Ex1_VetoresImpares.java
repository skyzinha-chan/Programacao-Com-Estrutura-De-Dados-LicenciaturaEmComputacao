package lista3;

import java.util.Scanner;

public class Ex1_VetoresImpares {
	private static Scanner teclado = new Scanner(System.in);

	public static int[] preencherVetor() {

		int[] vetor = new int[100];

		for (int i = 0; i < 100; i++) {
			vetor[i] = teclado.nextInt();
		}
		teclado.close();
		return vetor;
	}

	public static void mostrarVetor(int[] vetor) {
		for (int i = 1; i < 100; i += 2) {
			System.out.println(vetor[i]);
		}

	}

	public static void main(String[] args) {
		int[] vetor = preencherVetor();
		mostrarVetor(vetor);
	}

}
