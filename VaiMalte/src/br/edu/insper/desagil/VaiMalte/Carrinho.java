package br.edu.insper.desagil.VaiMalte;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho() {
		pedidos = new ArrayList<Pedido>();
		
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
		
	}
		
	public void adicionaItem(Produto produto) {
		Pedido selecao = null;
		for(Pedido pedido: pedidos ) {
			if (pedido.getProduto().getCodigo() == produto.getCodigo()) {
				selecao = pedido;
		    } 
		
				
			
		}
		if (selecao != null) {
			selecao.incrementaQuantidade();
		
	    } else {
	    	pedidos.add(new Pedido(produto));
			
		}
		}
		
		

		
	}
	
	
	

	
