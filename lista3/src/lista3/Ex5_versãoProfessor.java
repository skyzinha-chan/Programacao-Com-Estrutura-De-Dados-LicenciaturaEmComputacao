package lista3;

import java.util.Scanner;

public class Ex5_versãoProfessor {
	private static Scanner teclado = new Scanner(System.in);

	public static void somar() {
		char[] vetor = new char[100];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.next().charAt(0);
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 'A') {
				soma += 1;
			}
		}

		System.out.printf("Sao %d ocorrencias!", soma);

	}

	public static void main(String[] args) {
		somar();
	}
}
