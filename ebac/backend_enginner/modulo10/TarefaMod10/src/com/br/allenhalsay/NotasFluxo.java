package com.br.allenhalsay;
import java.util.Scanner;

public class NotasFluxo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("**** PROGRAMA PARA CALCULAR MÉDIA E VER SITUAÇÃO DO ALUNO ****");
		System.out.println("");
		
		System.out.println("Digite a nota da primeira prova: ");
		double nota1 = s.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = s.nextDouble();
		
		System.out.println("Digite a nota da terceira prova: ");
		double nota3 = s.nextDouble();
		
		System.out.println("Digite a nota da quarta prova: ");
		double nota4 = s.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A média do aluno é: " + media);
		
		if (media >= 7) {
			System.out.println("APROVADO");
		} else if (media >= 5 && media <7) {
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("REPROVADO");
		}
	}
}
