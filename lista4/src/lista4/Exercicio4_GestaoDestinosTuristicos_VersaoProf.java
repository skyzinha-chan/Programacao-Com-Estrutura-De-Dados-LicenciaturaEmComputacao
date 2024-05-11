package lista4;

import java.util.Scanner;

public class Exercicio4_GestaoDestinosTuristicos_VersaoProf {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Bem-vindo ao sistema de gestão de destinos turísticos!");
		System.out.println("Por favor, insira o número de destinos turísticos:");
		int numDestinos = teclado.nextInt();
		System.out.println(numDestinos);

		String[] nomes = new String[numDestinos];
		int[] duracoes = new int[numDestinos];
		double[] custos = new double[numDestinos];

		for (int i = 0; i < numDestinos; i++) {
			System.out.println("Destino " + (i + 1) + ":");
			System.out.print("Nome: ");
			nomes[i] = teclado.next();
			System.out.println(nomes[i]);
			System.out.print("Duração (dias): ");
			duracoes[i] = Integer.parseInt(teclado.next());
			System.out.println(duracoes[i]);
			System.out.print("Custo ($): ");
			custos[i] = Double.parseDouble(teclado.next());
			System.out.println(custos[i]);
		}

		double mediaDuracao = calcularMediaDuracao(duracoes);
		int indiceDestinoMaisCaro = encontrarDestinoMaisCaro(custos);
		int indiceDestinoMaisBarato = encontrarDestinoMaisBarato(custos);

		System.out.println("\nEstatísticas:");
		System.out.println("Média de duração das viagens: " + mediaDuracao + " dias");
		System.out.println(
				"Destino mais caro: " + nomes[indiceDestinoMaisCaro] + " ($" + custos[indiceDestinoMaisCaro] + ")");
		System.out.println("Destino mais barato: " + nomes[indiceDestinoMaisBarato] + " ($"
				+ custos[indiceDestinoMaisBarato] + ")");

		teclado.close();
	}

	public static double calcularMediaDuracao(int[] duracoes) {
		int soma = 0;
		for (int duracao : duracoes) {
			soma += duracao;
		}
		return (double) soma / duracoes.length;
	}

	public static int encontrarDestinoMaisCaro(double[] custos) {
		int indice = 0;
		double maiorCusto = custos[0];
		for (int i = 1; i < custos.length; i++) {
			if (custos[i] > maiorCusto) {
				maiorCusto = custos[i];
				indice = i;
			}
		}
		return indice;
	}

	public static int encontrarDestinoMaisBarato(double[] custos) {
		int indice = 0;
		double menorCusto = custos[0];
		for (int i = 1; i < custos.length; i++) {
			if (custos[i] < menorCusto) {
				menorCusto = custos[i];
				indice = i;
			}
		}
		return indice;
	}
}