package lista1;

import java.util.Scanner;

public class Ex6 {

	public static void qualMaior(int a, int b) {

		if (a > b) {
			System.out.println("O primeiro valor eh maior");
		} else if (b > a) {
			System.out.println("O segundo valor eh maior");
		} else if (a == b) {
			System.out.println("Nao existe valor maior, os dois sao iguais");
		}

	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		qualMaior(a, b);

		teclado.close();
	}

	public static void main(String[] args) {
		// Solicite a, b e compare-os.

		Scanner teclado = new Scanner(System.in);

		inserirDados();

		teclado.close();
	}

}