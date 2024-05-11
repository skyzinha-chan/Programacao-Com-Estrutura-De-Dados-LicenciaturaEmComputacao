package lista1;

import java.util.Scanner;

public class Ex2 {

	public static void Cumprimento(int hora) {
		if (hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora <= 17) {
			System.out.println("Boa Tarde");
		} else if (hora > 18) {
			System.out.println("Boa Noite");
		}
	}

	public static void main(String[] args) {
		// Solicite a hora ao usuário e informe se é bom dia, boa tarde ou boa noite.

		Scanner teclado = new Scanner(System.in);
		int hora = teclado.nextInt();

		Cumprimento(hora);

		teclado.close();
	}

}
