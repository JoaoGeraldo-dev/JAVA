package model;

public class Produto {
	String nome;
	int qtde;
	double preco;
	
	public Produto(String nome, int qtde, double preco) {
		this.nome = nome;
		this.qtde = qtde;
		this.preco = preco;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
}
