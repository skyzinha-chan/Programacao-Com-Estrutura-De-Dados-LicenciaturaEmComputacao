package lista1;

import java.util.Scanner;

public class Ex9 {

	public static boolean ehMultiplo(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void multiplo(int a, int b) {
		if (ehMultiplo(a, b) == true) {
			System.out.printf("%d é múltiplo de %d \n", a, b);
		} else {
			System.out.printf("%d não é múltiplo de %d \n", a, b);
		}

	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();

		multiplo(a, b);

		teclado.close();
	}

	public static void main(String[] args) {
		// Calcule multiplos.

		Scanner teclado = new Scanner(System.in);

		inserirDados();

		teclado.close();
	}

}