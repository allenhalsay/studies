package br.com.allenhalsay;

public class NotasWrapper {

	public static void main(String[] args) {
		notasWrapper();
	}

	private static void notasWrapper() {
		double nota1 = 9;
		double nota2 = 8.5;
		double nota3 = 7.6;
		double nota4 = 9.9;
//		double media = (nota1 + nota2 + nota3 + nota4)/4;
//		System.out.println(media);
		
//		Convertendo a variável media para Wrapper.
		Double media = (nota1 + nota2 + nota3 + nota4)/4;;
		System.out.println(media);
	}
}
