package lista1;

import java.util.Scanner;

public class Ex5 {

	public static void salarioLiquido(float salarioBruto, int quantidade_dependentes, float porcentagem_inss) {
		float desconto_inss = salarioBruto * (porcentagem_inss / 100);
		float desconto_dependentes = quantidade_dependentes * 100;
		float salario_liquido = salarioBruto - desconto_inss - desconto_dependentes;

		System.out.printf("Salario bruto: R$ %.2f \n", salarioBruto);
		System.out.printf("Desconto do INSS: R$ %.2f \n", desconto_inss);
		System.out.printf("Desconto dos dependentes: R$ %.2f \n", desconto_dependentes);
		System.out.printf("Salario liquido: R$ %.2f \n", salario_liquido);
	}

	public static void inserirDados() {
		Scanner teclado = new Scanner(System.in);
		float salarioBruto = teclado.nextFloat();
		int quantidade_dependentes = teclado.nextInt();
		float porcentagem_inss = teclado.nextFloat();
		salarioLiquido(salarioBruto, quantidade_dependentes, porcentagem_inss);

		teclado.close();
	}

	public static void main(String[] args) {
		// Solicite salario bruto e descontos e informe salario liquido.

		Scanner teclado = new Scanner(System.in);

		inserirDados();

		teclado.close();
	}

}