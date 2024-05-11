package lista1;

import java.util.Scanner;

public class Ex4 {

	public static void atualizaSalario(float salario) {
		if (salario >= 1000) {
			System.out.printf("Seu salario eh..: %f \n", salario);
		} else {
			salario = (float) (salario + (salario * 0.1));
			System.out.printf("Seu salario eh..: %f \n", salario);
		}
	}

	public static void main(String[] args) {
		// Solicite salario e informe atualizado com 10% ou somente o valor dele.

		Scanner teclado = new Scanner(System.in);

		float salario = teclado.nextFloat();

		atualizaSalario(salario);

		teclado.close();
	}

}