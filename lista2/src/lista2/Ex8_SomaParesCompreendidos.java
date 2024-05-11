package lista2;

import java.util.Scanner;

public class Ex8_SomaParesCompreendidos {

	public static void somar() {
		// Soma dos Impares
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int soma = 0;
		while (numero <= 0) {
			numero = teclado.nextInt();
		}
		for (int i = 0; i <= numero; i += 2) {
			soma += i;
		}
		System.out.printf("Foram no total ...: %d\n", soma);

		teclado.close();
	}

	public static void main(String[] args) {
		somar();
	}
}
