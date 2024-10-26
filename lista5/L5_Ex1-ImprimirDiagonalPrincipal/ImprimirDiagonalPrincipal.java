/*
Desenvolva um programa que declare uma matriz do tipo inteiro contendo 3 linhas por 3 coluna, na sequência preencha a matriz com valores que o usuário digitar e no final mostre somente os números que estão na diagonal principal da matriz.

Entrada de dados:

23 45 67 12 34 56 78 89 90

Saída de dados:

23  34  90

*/
import java.util.Scanner;

public class ImprimirDiagonalPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner teclado = new Scanner(System.in);
		int[][] matriz1 = new int[3][3];
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz1[linha][coluna] = teclado.nextInt();
			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if ( linha == coluna) {
					System.out.print(" " + matriz1[linha][coluna] + " ");
				}
			}
		}

	}

}