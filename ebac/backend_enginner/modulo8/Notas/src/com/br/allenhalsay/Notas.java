package com.br.allenhalsay;

public class Notas {

	public static void main(String[] args) {
		calcularMedia();
	}

	private static void calcularMedia() {
		double nota1 = 8;
		double nota2 = 8;
		double nota3 = 7;
		double nota4 = 10;
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(media);
	}

}
