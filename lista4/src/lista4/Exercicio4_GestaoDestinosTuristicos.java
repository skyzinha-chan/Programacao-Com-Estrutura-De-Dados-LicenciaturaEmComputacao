package lista4;

import java.util.Scanner;

public class Exercicio4_GestaoDestinosTuristicos {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();

		int tamanho = teclado.nextInt();
		System.out.println(tamanho);
		
		String[] destinoPais = new String[tamanho];
		int[] duracao = new int[tamanho];
		double[] custos = new double[tamanho];

		preencherVetores(destinoPais, duracao, custos, tamanho);

		mostrarResultados(duracao, custos, destinoPais);
		teclado.close();
	}

	public static void menu() {
		System.out.println("Bem-vindo ao sistema de gestão de destinos turísticos!");
		System.out.println("Por favor, insira o número de destinos turísticos: ");
	}

	public static void mostrarResultados(int[] duracao, double[] custos, String[] destinoPais) {
		int somaDuracao = 0;
		double maiorCusto = Double.MIN_VALUE;
		double menorCusto = Double.MAX_VALUE;
		String destinoMaisCaro = null;
		String destinoMaisBarato = null;

		for (int i = 0; i < duracao.length; i++) {
			somaDuracao += duracao[i];
			if (custos[i] > maiorCusto) {
				maiorCusto = custos[i];
				destinoMaisCaro = destinoPais[i];
			}
			if (custos[i] < menorCusto) {
				menorCusto = custos[i];
				destinoMaisBarato = destinoPais[i];
			}
		}

		double mediaDuracaoViagens = (double) somaDuracao / duracao.length;

		System.out.printf("\nEstatísticas:");
		System.out.printf("\nMédia de duração das viagens: %.1f dias", mediaDuracaoViagens);
		System.out.printf("\nDestino mais caro: %s ($%.1f)", destinoMaisCaro, maiorCusto);
		System.out.printf("\nDestino mais barato: %s ($%.1f)", destinoMaisBarato, menorCusto);
	}

	public static void preencherVetores(String[] destinoPais, int[] duracao, double[] custos, int tamanho) {
		

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Destino %d: \n", i + 1);

			System.out.print("Nome: ");
			destinoPais[i] = teclado.next();
			System.out.print(destinoPais[i]);

			System.out.print("\nDuração (dias): ");
			duracao[i] = Integer.parseInt(teclado.next());
			System.out.print(duracao[i]);

			
			System.out.print("\nCusto ($): ");
			custos[i] = teclado.nextDouble();
			System.out.println(custos[i]);
		}

	}

}
