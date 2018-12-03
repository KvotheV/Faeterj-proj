package br.edu.faeterj.loja;

public class ItensCarrinho {
	private produto Produto;
	private int qtd;
	private double valor;
	
	public ItensCarrinho(produto Produto, int qtd) {
		super();
		this.Produto = Produto;
		this.qtd = qtd;
		this.valor = this.Produto.getPreco()*this.qtd;
	}


	public produto getProduto() {
		return Produto;
	}

	public String getProdutoName() {
		return Produto.getNome();
	}
	
	public void setProduto(produto produto) {
		Produto = produto;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
