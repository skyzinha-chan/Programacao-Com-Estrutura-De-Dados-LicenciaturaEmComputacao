package lista2;

import java.util.Scanner;

public class Ex2_calcularMedia {

	public static void realizarMedia() {
		Scanner teclado = new Scanner(System.in);
		double notas = teclado.nextDouble();
		int contarNotas = 0;
		double somarNotas = 0;
		while (notas != -1) {
			somarNotas += notas;
			contarNotas++;
			notas = teclado.nextDouble();
		}
		if (contarNotas > 0) {
			double media = somarNotas / contarNotas;
			System.out.printf("A media eh: %.1f\n", media);
		}
		teclado.close();
	}

	public static void main(String[] args) {
		realizarMedia();
	}
}
