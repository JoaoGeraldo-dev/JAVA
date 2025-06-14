package model;
import java.util.ArrayList;



public class listaprodutos {
	private ArrayList<Produto> produtos;
	
	public listaprodutos() {
		produtos = new ArrayList<>();
	}
	
	public boolean removeProd(String nome) {
		int p = buscarProduto(nome);
		if(p >= 0) {
			produtos.remove(p);
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean addProd(Produto produto) {
		String nomeP = produto.getNome();
		if(buscarProduto(nomeP) == -1){
			produtos.add(produto);
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Produto> listarprodutos(){
		return produtos;
	}
		
	
	public int buscarProduto(String nome){
	int i = 0;
	for(Produto produto : produtos) {
		if(produto.getNome().equals(nome)) {
			return i;
		}
		return i++;
	}
	return -1;
	}
}
