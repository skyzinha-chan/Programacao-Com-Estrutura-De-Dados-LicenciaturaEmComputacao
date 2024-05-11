package lista4;

import java.util.Scanner;

public class Exercicio2_LojaDeEletronicos {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();

		int tamanho = teclado.nextInt();
		int vetor[] = preencherVetor(tamanho);

		int totalCaixa = totalCaixa(vetor);
		int maiorProducao = maiorProducao(vetor) + 1;
		int menorProducao = menorProducao(vetor) + 1;

		mostrarResultados(totalCaixa, maiorProducao, menorProducao);
		teclado.close();
	}

	public static void menu() {
		System.out.println("Bem-vindo ao sistema de controle de vendas!");
		System.out.println("Por favor, insira o número de dias de vendas: ");
	}

	public static void mostrarResultados(int totalCaixa, int maiorProducao, int menorProducao) {
		System.out.println("\n\nResultados: ");
		System.out.println("Valor total de vendas: $" + totalCaixa);
		System.out.println("Dia com o maior valor de vendas: Dia " + maiorProducao);
		System.out.println("Dia com o menor valor de vendas: Dia " + menorProducao);
	}

	public static int[] preencherVetor(int tamanho) {
		System.out.println(tamanho);
		int vetor[] = new int[tamanho];
		System.out.print("Agora, insira os valores das vendas para cada dia: ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("\nDia %d: ", i + 1);

			while (!teclado.hasNextInt()) {
				teclado.next();
			}
			vetor[i] = teclado.nextInt();
			System.out.print(vetor[i]);
		}
		return vetor;
	}

	public static int totalCaixa(int[] vetor) {
		int totalCaixa = 0;
		for (int i = 0; i < vetor.length; i++) {
			totalCaixa += vetor[i];
		}

		return totalCaixa;
	}

	public static int maiorProducao(int[] vetor) {
		int maiorProducao = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > vetor[maiorProducao]) {
				maiorProducao = i;
			}
		}
		return maiorProducao;
	}

	public static int menorProducao(int[] vetor) {
		int menorProducao = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < vetor[menorProducao]) {
				menorProducao = i;
			}
		}
		return menorProducao;
	}

}
