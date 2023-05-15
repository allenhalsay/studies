package br.com.allenhalsay;

// Criação da Classe Cliente
// Inicia-se classe com letra maiúscula
public class Cliente {
	
//	VARIÁVEIS
//	Criamos variáveis usando o private, quer dizer que somente a classe Cliente vai ter acesso a ela.. 
//	Usando int que informa que a variável é do tipo inteiro.
//	Usando string que informa que a variável é do tipo texto, com caracteres.
	
	private int codigo;
	private String nome;
	private String endereco;
	
//	GETTERS AND SETTERS são métodos.
//	Por que existe métodos GETTERS e SETTERS?
//  Por que o uso do this?
//  O public é para que qualquer um acesse.
//  Todo método java que não retorna nada a gente usa void.
//  Todo método java que retorna texto a gente usa String.
//  Todo método java que retorna um número inteiro a gente usa int.
//  Inicia-se métodos com letras minúsculas,e as próximas palavras com letras maiúsculas.
//	O this quer dizer que o método pertence a essa classe aqui. (Classe Cliente). 
//	O this diz também, que o que vem depois do ponto é a variável declarada acima!
//	Os métodos recebem parâmetros. O que está dentro do parênteses na linha 42, por exemplo, é parâmetro. Temos vários aí!
//	O que vem depois da igualdade depois de this.endereço é o valor que recebe do parâmetro.
//	Get significa que eu vou pegar o valor.
//	Set significa que eu vou setar/adicionar o valor.
//	Se você quer pegar o valor da sua classe, dentro daquela variável, usar o getCodigo.
//	Se você quer setar/adicionar o valor a sua classe, usar o setCodigo;
//	Nunca usar programação nos GETTERS e SETTERS, depois vamos entender o por quê! Eles servem apenas para adicionar ou pegar valor!
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
	}
	
	public void imprimirEndereco() {
		System.out.println("Rua Y");
	}
	
	public String imprimirNomeAllen() {
		return "Allen Halsay";
	}
	
	public int imprimirNumeroCasa() {
		return 20;
	}
}

