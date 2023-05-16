package br.com.allenhalsay;

import java.util.Scanner;

public class ExemploAnimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome de um animal: ");
		String texto = s.next();
		String animal = example0fIF(texto);
		System.out.println(animal);
	}

	public static String example0fIF(String texto) {
		String result;
		if(texto.equals("DOG") || texto.equals("CAT")) {
			result = "domestic animal";
		} else if (texto.equals("TIGER")) {
			result = "wild animal";
		} else {
			result = "unknown animal";
		}
		return result;
	}
}
