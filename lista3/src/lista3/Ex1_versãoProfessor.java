package lista3;

import java.util.Scanner;

public class Ex1_versãoProfessor {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void somar() {
		int[] vetor = new int[100];
		teclado = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				System.out.println(vetor[i]);
			}
		}
		teclado.close();
	}

	public static void main(String[] args) {
		somar();
		
		
		}
}
