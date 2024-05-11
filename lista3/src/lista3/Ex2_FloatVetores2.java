package lista3;

import java.util.Scanner;

public class Ex2_FloatVetores2 {
	private static Scanner teclado = new Scanner(System.in);

	public static float[] preencherVetor() {
		float[] vetor = new float[100];

		for (int i = 0; i < 100; i++) {
			vetor[i] = teclado.nextFloat();
		}
		teclado.close();
		return vetor;
	}

	public static void contemValor(float[] vetor, float procurado) {
		for (int i = 0; i < 100; i++) {
			if (vetor[i] == procurado) {
				System.out.println("Tem");
				return;
			}
		}

		System.out.println("Nao tem");
	}

	public static void main(String[] args) {

		float[] vetor = preencherVetor();
		float procurado = teclado.nextFloat();

		contemValor(vetor, procurado);

	}

}
