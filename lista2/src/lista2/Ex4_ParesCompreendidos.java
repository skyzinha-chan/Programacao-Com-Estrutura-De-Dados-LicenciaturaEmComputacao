package lista2;

import java.util.Scanner;

public class Ex4_ParesCompreendidos {

	public static void mostrarParesCompreendidos() {
		// Mostrar Pares Compreendidos
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero <= 0) {
			numero = teclado.nextInt();
		}
		
		for (int i = numero ; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

	public static void main(String[] args) {
		mostrarParesCompreendidos();
	}
}
