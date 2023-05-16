package com.br.allenhalsay;

public class Exemplo1 {

	public static void main(String[] args) {
//		Boxing (Autoboxing)
		
		Boolean status = true; //Boxing é pegar um valor primitivo e colocar num wrapper.
		Character c = 'A';
		Integer idade = 10;
		Long cpf = 123456789l;
		
//		Unboxing
		
		Boolean status1 = Boolean.TRUE;
		char letra = Character.valueOf('A');
		int idade2 = Integer.valueOf(12);
		long cpf3 = Long.valueOf(1231231l);
	}

}
