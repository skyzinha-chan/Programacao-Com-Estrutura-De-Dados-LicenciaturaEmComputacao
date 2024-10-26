import java.util.Scanner;

public class App {

	// FUNÇÃO EXECUTADORA
	public static void main(String[] args) {
		System.out.println("\t\t\tHello, World!");
		int[] listaValores = preencherVetor();
		mostrarVetor(listaValores);
		int menorValor = salvarMenor(listaValores);
		int maiorValor = salvarMaior(listaValores);

		System.out.println("\t\t\t\n Resultados: ");
		System.out.println("\tO menor valor é: " + menorValor);
		System.out.println("\tO maior valor é:  " + maiorValor);
		System.out.print("\tOs valores nas posições pares: ");
		posicoesPar(listaValores);
		System.out.print("\n\tOs valores nas posições ímpares: ");
		posicoesImpar(listaValores);
		System.out.print("\n\tOs valores pares inseridos: ");
		valoresPar(listaValores);
		System.out.print("\n\tOs valores impares inseridos: ");
		valoresImpar(listaValores);

	}

	// FUNCÃO PARA RETORNAR UM VETOR PREENCHIDO
	public static int[] preencherVetor() {
		Scanner teclado = new Scanner(System.in);
		System.out
				.println("\t\t\tBem-Vindo Usuário! Insira a quantidade de valores que serão salvos do tipo Inteiro: ");
		int tamanho = teclado.nextInt();
		System.out.printf(
				"\t\t\tSerão lidos e salvo em um vetor: %d números/valores. \n\t\t\tDigite os números abaixo: \n",
				tamanho);
		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}
		teclado.close();
		return vetor;
	}

	// PROCEDIMENTO PARA MOSTRAR O VETOR ESCOLHIDO
	public static void mostrarVetor(int[] listaValores) {
		System.out.printf("\t\t\tOs valores inseridos foram: ");
		for (int i = 0; i < listaValores.length; i++) {

			
			System.out.print(listaValores[i] + " ");
		}
	}

	// FUNCÃO PARA SALVAR E RETORNAR O MENOR VALOR
	public static int salvarMenor(int[] listaValores) {
		int salvarMenorValor = listaValores[0];
		for (int i = 0; i < listaValores.length; i++) {
			if (listaValores[i] < salvarMenorValor) {
				salvarMenorValor = listaValores[i];
			}
		}
		return salvarMenorValor;
	}

	// FUNÇÃO PARA SALVAR E RETORNAR O MAIOR VALOR
	public static int salvarMaior(int[] listaValores) {
		int salvarMaiorValor = listaValores[0];
		for (int i = 0; i < listaValores.length; i++) {
			if (listaValores[i] > salvarMaiorValor) {
				salvarMaiorValor = listaValores[i];
			}
		}
		return salvarMaiorValor;
	}

	// PROCEDIMENTO PARA MOSTRAR AS POSIÇÕES PARES
	public static void posicoesPar(int[] listaValores) {
		for (int i = 0; i < listaValores.length; i += 2) {
			System.out.print(listaValores[i]);
			if (i < listaValores.length - 2) {
				System.out.print(",");
			}
		}
	}

	// PROCEDIMENTO PARA MOSTRAR AS POSIÇÕES IMPARES
	public static void posicoesImpar(int[] listaValores) {
		for (int i = 1; i < listaValores.length; i += 2) {
			System.out.print(listaValores[i]);
			if (i < listaValores.length - 2) {
				System.out.print(",");
			}
		}
	}

	// PROCEDIMENTO PARA MOSTRAR VALOR PAR
	public static void valoresPar(int[] listaValores) {
		boolean primeiroPar = true;
		for (int i = 0; i < listaValores.length; i++) {
			if (listaValores[i] % 2 == 0) {
				if (!primeiroPar) {
					System.out.print(",");
				}
				System.out.print(listaValores[i]);
				primeiroPar = false;
			}

		}
	}

	// PROCEDIMENTO PARA MOSTRAR VALOR IMPAR
	public static void valoresImpar(int[] listaValores) {
		for (int i = 0; i < listaValores.length; i++) {
			if (listaValores[i] % 2 != 0) {
				System.out.print(listaValores[i]);
				if (i < listaValores.length - 1) {
					System.out.print(",");
				}
			}
		}
	}

}