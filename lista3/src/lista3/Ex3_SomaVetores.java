package lista3;

import java.util.Scanner;

public class Ex3_SomaVetores {
	private static Scanner teclado = new Scanner(System.in);

	public static int[] preencherVetor() {
		int[] vetor = new int[100];

		for (int i = 0; i < 100; i++) {
			vetor[i] = teclado.nextInt();
		}

		return vetor;
	}

	public static void realizarSomatorio(int[] vetor) {
		int somatorio = 0;
		for (int i = 0; i < 100; i++) {
			somatorio += vetor[i];
		}
		System.out.println(somatorio);
	}

	public static void main(String[] args) {
		int[] vetor = preencherVetor();
		realizarSomatorio(vetor);
	}
}