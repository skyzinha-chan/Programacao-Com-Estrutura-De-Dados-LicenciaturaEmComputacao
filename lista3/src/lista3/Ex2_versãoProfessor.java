package lista3;

import java.util.Scanner;

public class Ex2_versãoProfessor {
	private static Scanner teclado = new Scanner(System.in);

	public static void somar() {
		float[] vetor = new float[100];
		float procurado;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextFloat();
		}

		procurado = teclado.nextFloat();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == procurado) {
				System.out.println("Tem");
				return;
			}
		}
		System.out.println("Nao tem");

	}

	public static void main(String[] args) {
		somar();
	}
}
