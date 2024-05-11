package lista2;

import java.util.Scanner;

public class Ex10_contarParesMultiplos {

	public static void contarParesMultiplos(int numero) {
		int contarPares_Multiplos = 0;

		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				contarPares_Multiplos++;

			}
		}
		System.out.printf("Foram contados no total..: %d numeros pares e multiplos de 5\n", contarPares_Multiplos);
	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero < 0) {
			numero = teclado.nextInt();
		}
		contarParesMultiplos(numero);
		teclado.close();
	}

	public static void main(String[] args) {
		inserirDados();
	}
}
