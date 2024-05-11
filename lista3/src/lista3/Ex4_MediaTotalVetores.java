package lista3;

import java.util.Scanner;

public class Ex4_MediaTotalVetores {
	private static Scanner teclado = new Scanner(System.in);

	public static int[] preencherVetor() {
		int[] vetor = new int[100];

		for (int i = 0; i < 100; i++) {
			vetor[i] = teclado.nextInt();
		}

		return vetor;
	}

	public static int realizarSomatorio(int[] vetor) {
		int somatorio = 0;

		for (int i = 0; i < 100; i++) {
			somatorio += vetor[i];
		}
		return somatorio;

	}

	public static void mostrarMaioresQueMedia(int somatorio, int[] vetor) {

		for (int i = 0; i < 100; i++) {
			if (somatorio / 100 <= vetor[i]) {
				System.out.println(vetor[i]);
			}

		}
	}

	public static void main(String[] args) {
		int[] vetor = preencherVetor();
		int somatorio = realizarSomatorio(vetor);
		mostrarMaioresQueMedia(somatorio, vetor);
	}
}