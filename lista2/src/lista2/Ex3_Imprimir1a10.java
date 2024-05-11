package lista2;

public class Ex3_Imprimir1a10 {

	public static void imprimirUmAoDez() {
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
			if (i < 10) {
                System.out.print(",");
            }
		}
		

	}

	public static void main(String[] args) {
		imprimirUmAoDez();
	}
}
