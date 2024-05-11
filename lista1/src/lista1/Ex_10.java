package lista1;

import java.util.Scanner;

public class Ex_10 {

	public static void tarifaKwh(long kwH) {
		double tarifa = 0, fatura = 0;

		if (kwH < 50) {
			tarifa = 0.5;
			fatura = kwH * tarifa;
		} else if (kwH >= 50 && kwH < 150) {
			tarifa = 1;
			fatura = kwH * tarifa;

		} else if (kwH >= 150 && kwH < 300) {
			tarifa = 1.5;
			fatura = kwH * tarifa;
		} else if (kwH >= 300) {
			tarifa = 3.5;
			fatura = kwH * tarifa;
		}
		System.out.printf("A taxa cobrada e ...: %.1f", tarifa);
		System.out.printf("O valor total a ser pago ....: %.1f\n", fatura);

	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		long kwH = teclado.nextLong();

		tarifaKwh(kwH);

		teclado.close();
	}

	public static void main(String[] args) {
		// Calcule fatura de clientes.

		inserirDados();

	}

}