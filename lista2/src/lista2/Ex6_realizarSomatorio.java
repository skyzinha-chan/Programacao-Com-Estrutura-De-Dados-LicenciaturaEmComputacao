package lista2;


public class Ex6_realizarSomatorio {
	
	public static void realizarSomatorio() {
		int somatorio = 0;
		for (int i = 0; i < 101; i++) {
			somatorio += i * i;
		}
		System.out.printf("O resultado e ...: %d\n", somatorio);
	}


	public static void main(String[] args) {
				realizarSomatorio();
	}
}
