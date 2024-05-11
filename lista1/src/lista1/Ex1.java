package lista1;

import java.util.Scanner;

public class Ex1 {

	public static boolean ehBissexto(int ano) {
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void bissexto(int ano) {
		if (ehBissexto(ano)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
	}

	public static void main(String[] args) {
		//Solicite o ano ao usuário e informe se é bissexto ou não.
		Scanner teclado = new Scanner(System.in);
		int ano = teclado.nextInt();
		
		
		bissexto(ano);
		
		teclado.close();
	}

}
