package pacote1;


public class Classe1 {
//	Padrão de desenvolvimento: Em todas as variáveis dentro da classe colocamos como private, e dá acesso as variáveis
//	através de métodos públicos. Lembrando quem em GETTERS e SETTERS nunca se deve colocar uma regra.
	
//	ESTUDO DE MODIFICADORES DE ACESSO:
//	Na mesma classe temos acesso ao private, default, protected, public.
//	No mesmo pacote temos acesso ao default, protected, public.
//	Em pacotes diferentes com subclasses, temos acesso ao protected e public.
//	Em pacotes diferentes sem subclasses, temos acesso apenas ao public.
	
//	DICA
	
//	Não existe nenhuma regra, somente boas práticas. Vamos do começo.
//	Pra começar existem somente 3 modificadores (private, protected e public), e com isso temos 4 níveis de visibilidade
//	Os níveis são os que você disse: private, default, protected e public
//	Private: A única classe que tem acesso ao atributo é a própria classe que o define, ou seja, se uma classe Pessoa declara um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.
//	Default: Tem acesso a um atributo default (identificado pela ausência de modificadores) todas as classes que estiverem no mesmo pacote que a classe que possui o atributo.
//	Protected: Esse é o que pega mais gente, ele é praticamente igual ao default, com a diferença de que se uma classe (mesmo que esteja fora do pacote) estende da classe com o atributo protected, ela terá acesso a ele. Então o acesso é por pacote e por herança.
//	Public: Esse é fácil, todos tem acesso :)

//	O nível de visibilidade envolve encapsulamento. 
//	É sempre dito como boa prática que atributos internos devem ser privados, 
//	pois classes externas nem devem saber que ele existe. O que a classe expõe são 
//	suas funcionalidades, sua API, se preferir. Expor atributos internos pode causar 
//	sérios problemas de segurança. Se tem algo que é inerente à implementação, que pode 
//	vir a mudar no futuro. provavelmente deve ser privado.
	
	private String propriedadePrivada;
	public String propriedadePublica;
	String propriedadeDefault;
	protected String propriedadeProtegida;
	
	public String getPropriedadePrivada() {
		return propriedadePrivada;
	}
}
