package lista3;

import java.util.Scanner;

public class Ex3_versãoProfessor {
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

		System.out.println(soma);
	}

	public static void main(String[] args) {
		somar();
	}
}