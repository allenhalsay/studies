package br.com.allenhalsay;

public class Operadores {
	
	public static void main (String Args[]) {
		OperacoesAritmeticas();
		OperacoesAtribuicoes();
		OperacoesIncrementoDecremento();
		OperacoesRelacionais();
		OperadoresLogicos();
	}
	
	private static void OperadoresLogicos() {
//		Operadores Lógicos &&, ||, !(not)
		System.out.println("**** Operadores Lógicos ****");
		System.out.println("");
		int num1 = 10;
		boolean testeLogico = num1 >=1 && num1 <=10;
		System.out.println(testeLogico);
		
		boolean testeLogico2 = num1 >=1 || num1 <=10;
		System.out.println(testeLogico2);
		
		boolean testeLogico3 = num1 >=1 || num1 <=10;
		System.out.println(!testeLogico3);
		System.out.println("");
	}

	private static void OperacoesRelacionais() {
		System.out.println("**** Operações Relacionais ****");
		System.out.println("");
		int num1 = 10;
		int num2 = 20;
		
		boolean isMaior = num1 > num2;
		System.out.println("Num1 é maior que Num2 é " + isMaior);
		
		boolean isIgual = num1 == num2;
		System.out.println("Num1 é igual a Num2 é " + isIgual);
		
		boolean isDiferente = num1 != num2;
		System.out.println("Num1 é diferente de Num2 é " + isDiferente);
		
		boolean isMaiorIgual = num1 >= num2;
		System.out.println("Num1 é maior ou igual a Num2 é " + isMaiorIgual);
		
		boolean isMenorIgual = num1 <= num2;
		System.out.println("Num1 é menor ou igual a Num2 é " + isMenorIgual);
		System.out.println("");
	}

	private static void OperacoesIncrementoDecremento() {
		System.out.println("**** Operacoes de Incremento e Decremento ****");
		System.out.println("");
		int x = 10;
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		System.out.println("");
	}

	private static void OperacoesAtribuicoes() {
		System.out.println("**** Operacoes de Atribuição ****");
		System.out.println("");
		int number1 = 10;
		int number2 = 5;
		int number3 = number1 + number2;
		System.out.println(number3);
		number3 += number3;
		System.out.println(number3);
		System.out.println("");
	}

	public static void OperacoesAritmeticas() {
		System.out.println("**** Operadores Aritméticos ****");
		System.out.println("");
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		double num6 = num1 / num2;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.printf("%.2f",num6);
		System.out.println("");
	}
}
