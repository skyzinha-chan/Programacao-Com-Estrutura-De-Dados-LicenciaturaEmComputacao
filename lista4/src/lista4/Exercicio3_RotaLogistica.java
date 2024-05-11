package lista4;

import java.util.Scanner;

public class Exercicio3_RotaLogistica {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();

		int tamanho = teclado.nextInt();
		float vetor[] = preencherVetor(tamanho);

		float distanciaPercorridaTotal = distanciaPercorridaTotal(vetor);

		mostrarResultados(distanciaPercorridaTotal);
		teclado.close();
	}

	public static void menu() {
		System.out.println("Bem-vindo ao sistema de cálculo de distância de rotas!");
		System.out.println("Por favor, insira o número de pontos de controle ao longo da rota: ");
	}

	public static void mostrarResultados(float distanciaPercorridaTotal) {
		System.out.printf("\n\nDistância total percorrida: %.1f unidades de distância", distanciaPercorridaTotal);
	}

	public static float[] preencherVetor(int tamanho) {
		System.out.println(tamanho);
		float vetor[] = new float[tamanho];
		System.out.print("Agora, insira as distâncias entre os pontos de controle: ");

		for (int i = 0; i < vetor.length - 1; i++) {
			System.out.printf("\nDistância do ponto %d ao ponto %d: ", i + 1, i + 2);

			while (!teclado.hasNextFloat()) {
				teclado.next();
			}
			vetor[i] = teclado.nextFloat();
			System.out.print(vetor[i]);
		}
		return vetor;
	}

	public static float distanciaPercorridaTotal(float[] vetor) {
		float distanciaPercorridaTotal = 0;
		for (int i = 0; i < vetor.length; i++) {
			distanciaPercorridaTotal += vetor[i];
		}

		return distanciaPercorridaTotal;
	}

}
