package br.edu.insper.desagil.VaiMalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> desconto;
	
	public Caixa() {
		super();
		this.desconto = new HashMap<>();
		
	}
		
	public void insereDesconto(Produto produto, int desconto) {
		int codigo = produto.getCodigo();
		if (desconto >= 1 && desconto <= 99) {
			this.desconto.put(codigo,desconto);
		}
		
	}
	
	public float totalNovo(Carrinho carrinho) {
		float total = 0;
		for (Pedido pedido : carrinho.getPedidos()) {
			Produto produto = pedido.getProduto();
			int codigo = produto.getCodigo();
			if (desconto.containsKey(codigo)) {
				total += pedido.devolveTotal() * (1 - (float)desconto.get(codigo)*(0.01));
			} else {
				total += pedido.devolveTotal();
			}			
		}
		return total;
	}		
}

