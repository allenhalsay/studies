package br.com.allenhalsay;

public class ExemploPPT1 {

	public static void main(String[] args) {
		exemplo1();
		exemplo2();
	}

	private static void exemplo2() {
		System.out.println("**** Exemplo 2 ****");
		
		int result = 9;
		
		if (result > 1 && result < 5) {
			System.out.println("Resultado está entre 1 e 5");
			System.out.println("");
		} else if (result >= 5 && result < 8) {
			System.out.println ("Resultado está entre 5 e 8");
			System.out.println("");
		} else {
			System.out.println("Resultado diferente dos anteriores");
			System.out.println("");
		}
	}

	private static void exemplo1() {
		System.out.println("**** Exemplo 1 ****");
		
		int result = 0;
		
		if (result > 1) {
			System.out.println("Resultado maior que 1");
			System.out.println("");
		} else {
			System.out.println("Resultado menor que 1");
			System.out.println("");
		}
	}
}
