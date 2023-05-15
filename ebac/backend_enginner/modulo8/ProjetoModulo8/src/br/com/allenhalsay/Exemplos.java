package br.com.allenhalsay;

public class Exemplos {
	
	/*Tipos primitivos em Java para declarar variáveis*/
	
	private int codigo;
	private long cpf;
	private float moeda;
	private double area;
	private String texto;
	private boolean status;
	private short item;
	private byte quantidade;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String retornarTexto() {
		return "Allen Halsay";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int retornarCodigo() {
		return 20;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public long retornarCpf(long cpf) {
		return cpf;
	}
}
