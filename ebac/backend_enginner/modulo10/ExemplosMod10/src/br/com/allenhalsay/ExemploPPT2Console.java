package br.com.allenhalsay;

import java.util.Scanner;

public class ExemploPPT2Console {

	public static void main(String[] args) {
		exemploPPT2Console();

	}

	private static void exemploPPT2Console() {
		System.out.println("**** Exemplo PPT2 Console ****");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int result = s.nextInt();
		
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
}

