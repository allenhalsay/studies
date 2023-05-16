package br.com.allenhalsay;

public class ExemploContinue {

	public static void main(String[] args) {
		for (int contador=1; contador<=101; contador++) {
			if (contador%5!=0) {
				continue;
			}
			System.out.println("Contador: "+contador);
		}
	}
}