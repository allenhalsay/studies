package com.br.allenhalsay;

public class Exemplo2 {

	public static void main(String[] args) {
		
//		
		int num1 = 10;
		short num2 = (short) num1; // Uso do casting explicito usando o (short) antes da variável.  
		
		long numL = 123121;
		System.out.println(numL);
		int numI = (int) numL; // Uso do casting explicito usando o (int) antes da variável.  
		System.out.println(numI);
		
		int idade = 10;
		long idadeL = idade; //Uso do casting implícito usando o (long).
		
		byte a = 1;
		short s = a;
		
		byte b1 = (byte) s;
		
		
	}
}
