package br.edu.insper.desagil.VaiMalte;

public class Testador {
	
	private Produto Itaipava = new Produto(1818,"Itaipava",5);
	private Produto Apia = new Produto(1826,"Apia",10);
	
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		float total = caixa.totalNovo(carrinho);
		
		if (total == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean testeB() {
		Carrinho carrinho  = new Carrinho();
		Caixa caixa = new Caixa();
		carrinho.adicionaItem(this.Itaipava);
		float total = caixa.totalNovo(carrinho);
		if (total == 5) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		carrinho.adicionaItem(this.Itaipava);
		caixa.insereDesconto(this.Itaipava,20);
		float total = caixa.totalNovo(carrinho);
		if (total == 4) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean testeD() {
	    return false;
	}

	public boolean testeE() {
	    return false;
	}
}
