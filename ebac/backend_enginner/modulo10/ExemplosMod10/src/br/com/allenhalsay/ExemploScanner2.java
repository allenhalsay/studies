package br.com.allenhalsay;

import java.util.Scanner;

public class ExemploScanner2 {

	public static void main(String[] args) {
		exemploScanner2();
	}

	private static void exemploScanner2() {
		Scanner b = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = b.nextLine();
		
		System.out.println("\nDigite sua altura: ");
		double altura = b.nextDouble();
		System.out.println("");
		
		System.out.println(nome + " tem " + altura + "m de altura.");
		
	}
}
