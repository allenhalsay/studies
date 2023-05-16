package br.com.allenhalsay;

import java.util.Scanner;

public class ExemploPPT1Console {

	public static void main(String[] args) {
		exemploPPT1Console();

	}

	private static void exemploPPT1Console() {
		System.out.println("**** Exemplo 1 - Console ****");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int result = s.nextInt();
		
		if (result > 1) {
			System.out.println("Resultado maior que 1");
			System.out.println("");
		} else {
			System.out.println("Resultado menor que 1");
			System.out.println("");
		}
		
	}

}
