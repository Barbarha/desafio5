package desafio5;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private String descricao;
	private double preco;
	private String categoria;
	private double avaliacao;
	
	public void cadastrar() {
		
	}
	public List<Produto> listar(){
		return new ArrayList<>();
		
	}
	public List<Produto>filtrar(String categoria){
		return new ArrayList<>();
	}
	public void avaliar() {
		this.avaliacao = avaliacao;
	}
}
