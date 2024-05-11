package lista1;

import java.util.Scanner;

public class Ex8 {

	public static float calcularIMC(float peso, float altura) {
		float imc = peso / (altura * altura);
		return imc;
	}

	public static void seuIMC(float imc) {
		String imc_classificacao = " ";
		if (imc < 18.5) {
			imc_classificacao = "Magreza";
			System.out.printf("O seu IMC e %.3f \n", imc);
			System.out.printf("A sua classificacao e...: %s", imc_classificacao);
		} else if (imc >= 18.5 && imc <= 24.9) {
			imc_classificacao = "Normal";
			System.out.printf("O seu IMC e %.3f \n", imc);
			System.out.printf("A sua classificacao e...: %s", imc_classificacao);
		} else if (imc >= 25 && imc <= 29.9) {
			imc_classificacao = "Sobrepeso";
			System.out.printf("O seu IMC e %.3f \n", imc);
			System.out.printf("A sua classificacao e...: %s", imc_classificacao);
		} else if (imc >= 30 && imc <= 39.9) {
			imc_classificacao = "Obesidade";
			System.out.printf("O seu IMC e %.3f \n", imc);
			System.out.printf("A sua classificacao e...: %s", imc_classificacao);
		} else if (imc >= 40) {
			imc_classificacao = "Obesidade Graves";
			System.out.printf("O seu IMC e %.3f \n", imc);
			System.out.printf("A sua classificacao e...: %s", imc_classificacao);
		}

	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		float peso = teclado.nextFloat();
		float altura = teclado.nextFloat();
		float imc = calcularIMC(peso, altura);
		seuIMC(imc);

		teclado.close();
	}

	public static void main(String[] args) {
		// Calcule IMC.

		Scanner teclado = new Scanner(System.in);

		inserirDados();

		teclado.close();
	}

}