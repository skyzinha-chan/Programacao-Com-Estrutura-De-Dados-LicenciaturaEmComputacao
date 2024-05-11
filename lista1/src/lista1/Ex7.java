package lista1;

import java.util.Scanner;

public class Ex7 {

	public static void podeAposentar(int idade, char sexo) {

		if (idade >= 65 && sexo == 'M') {
			System.out.println("Você pode se aposentar.");
		} else if (idade >= 60 && sexo == 'F') {
			System.out.println("Você pode se aposentar.");
		} else  {
			System.out.println("Você ainda não pode se aposentar.");
		}

	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		int idade = teclado.nextInt();
		char sexo = teclado.next().charAt(0);

		podeAposentar(idade, sexo);

		teclado.close();
	}

	public static void main(String[] args) {
		// Solicite idade e sexo e confira se pode aposentar.

		Scanner teclado = new Scanner(System.in);

		inserirDados();

		teclado.close();
	}

}