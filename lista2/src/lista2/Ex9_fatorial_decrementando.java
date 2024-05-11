package lista2;

import java.util.Scanner;

public class Ex9_fatorial_decrementando {
	
	public static void fatorar(int numero) {
		int cont = 1;
		int fatorial = 1;
		while (cont <= numero) {
			fatorial = 1;
			for (int i = 1; i <= numero; i++) {
				fatorial = fatorial * i;
			}
			System.out.printf("O fatorial de %d! ...: %d\n", numero, fatorial);
			numero--;
		}
	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero < 0) {
			numero = teclado.nextInt();
		}
		fatorar(numero);
		teclado.close();
	}

	public static void main(String[] args) {
		// Fatorial
		inserirDados();
	}
}
