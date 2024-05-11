package lista3;

import java.util.Scanner;

public class Ex4_versãoProfessor {
	private static Scanner teclado = new Scanner(System.in);

	public static void somar() {
		int[] vetor = new int[100];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		for (int i = 0; i < vetor.length; i++) {
			if (soma / 100 <= vetor[i]) {
				System.out.println(vetor[i]);
			}
		}

	}

	public static void main(String[] args) {
		somar();
	}
}
