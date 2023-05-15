package br.com.allenhalsay;

public class PrimeiraClasse {

	public static void main(String[] args) {
//		Criando uma variável cliente e instanciando a variável.
		Cliente cliente = new Cliente();
//		Inseringo um valor na variável código.
		cliente.setCodigo(1);
//		Inserindo um valor na variável endereço.
		cliente.setEndereco("Rua X");
//		Pegando o valor da variável código e imprimindo.
		System.out.println(cliente.getCodigo());
//		Usando um métódo para imprimir o endereço. Lá no método já tem o Sytem.out.println();
		cliente.imprimirEndereco();
//		Usando uma variável para colocar o valor de retorno do método imprimirNomeAllen. 
		String end = cliente.imprimirNomeAllen();
		System.out.println(end);
//		Usando o método direto no System.out.println() para imprimir o que está como retorno no método.
		System.out.println(cliente.imprimirNumeroCasa());
	}
}
