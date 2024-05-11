package lista1;

import java.util.Scanner;

public class Ex3 {

	public static void ehTriangulo(int a, int b, int c) {
		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			System.out.println("E um triângulo");
		} else {
			System.out.println("Nao e um triangulo");
		}
	}

	public static void main(String[] args) {
		// Solicite a, b, c e informe se é um triângulo.

		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();

		ehTriangulo(a, b, c);

		teclado.close();
	}

}
