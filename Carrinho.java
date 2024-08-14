package desafio5;

import java.util.Date;
import java.util.List;

public class Carrinho {
	private Usuario cliente;
	private List<Produto> listaDeProdutos;
	private double total;
	private Date data;
	private Endereco enderecoDeEntrega;
	
	public void adicionarProduto(Produto p) {
		listaDeProdutos.add(p);
		calcularTotal();
	}
	public void removerProduto(Produto p) {
		listaDeProdutos.remove(p);
		calcularTotal();
	}
	public void calcularTotal() {
		total = 0;
		for(Produto p: listaDeProdutos) {
			total += p.getPreco();
			
		}
	}
}
