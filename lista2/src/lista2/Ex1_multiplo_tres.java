package lista2;

public class Ex1_multiplo_tres {

	public static void imprimirMultiplosTres() {
		for (int i = 0; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
//imprimir multiplos de 3. De 0 a 30.
		imprimirMultiplosTres();
	}
}
