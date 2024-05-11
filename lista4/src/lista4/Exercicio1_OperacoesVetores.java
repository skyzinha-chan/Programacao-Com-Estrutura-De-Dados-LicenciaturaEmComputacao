package lista4;

import java.util.Scanner;

public class Exercicio1_OperacoesVetores {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
		int tamanho = teclado.nextInt();
		int vetor[] = preencherVetor(tamanho);
		int soma = somaVetor(vetor);
		int produto = produtoVetor(vetor);
		double media = mediaVetor(vetor);
		int maior = maiorVetor(vetor);
		int menor = menorVetor(vetor);
		mostrarResultados(soma, produto, media, maior, menor);

		teclado.close();

	}

	public static void menu() {
		System.out.println("Bem-vindo ao programa de operações com vetores!");
		System.out.println("Por favor, insira o tamanho do vetor: ");
	}

	public static void mostrarResultados(int soma, int produto, double media, int maior, int menor) {
		System.out.println("\n\nResultados: ");
		System.out.println("Soma dos elementos: " + soma);
		System.out.println("Produto dos elementos: " + produto);
		System.out.printf("Média dos elementos: %.1f \n", media);
		System.out.println("Maior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
	}

	public static int[] preencherVetor(int tamanho) {
		System.out.println(tamanho);
		int vetor[] = new int[tamanho];
		System.out.print("Agora, insira os elementos do vetor: ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("\nElemento %d: ", i + 1);

			while (!teclado.hasNextInt()) {
				teclado.next();
			}
			vetor[i] = teclado.nextInt();
			System.out.print(vetor[i]);
		}
		return vetor;
	}

	public static int somaVetor(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		return soma;
	}

	public static int produtoVetor(int[] vetor) {
		int produto = 1;
		for (int i = 0; i < vetor.length; i++) {
			produto *= vetor[i];
		}

		return produto;
	}

	public static double mediaVetor(int[] vetor) {
		double media = 0;
		float soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = (double) soma / vetor.length;

		return media;
	}

	public static int maiorVetor(int[] vetor) {
		int maior = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return maior;
	}

	public static int menorVetor(int[] vetor) {
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		return menor;
	}

}
