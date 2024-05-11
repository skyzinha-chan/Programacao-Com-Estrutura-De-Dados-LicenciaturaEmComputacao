package lista3;

import java.util.Scanner;

public class Ex5_RepeteVetorChar {
	private static Scanner teclado = new Scanner(System.in);

	public static char[] preencherVetor() {
		char[] vetor = new char[100];

		for (int i = 0; i < 100; i++) {
			vetor[i] = teclado.next().charAt(0);
		}

		return vetor;
	}

	public static void quantosAseRepetem(char[] vetor) {
		int somatorio = 0;

		for (int i = 0; i < 100; i++) {
			if (vetor[i] == 'A') {
				somatorio += 1;
			}
		}
		System.out.printf("Sao %d ocorrencias!\n", somatorio);

	}

	public static void main(String[] args) {
		char[] vetor = preencherVetor();
		quantosAseRepetem(vetor);
	}
}