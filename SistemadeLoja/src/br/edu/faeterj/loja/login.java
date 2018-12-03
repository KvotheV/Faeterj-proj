package br.edu.faeterj.loja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class login {
	
	//tipos de informações de usuário
	private String nome;
	private String email;
	private String senha;
	private String ncartao;
	
	//carrinho - lista
	public List<ItensCarrinho> cesta = new ArrayList<ItensCarrinho>();
	

	public boolean authNCartao(String ncartao) {
		
		if (this.ncartao == ncartao) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNcartao() {
		return ncartao;
	}

	public void setNcartao(String valoresEntreVirgulas) {
		this.ncartao = valoresEntreVirgulas;
	}

	public void novoitemcesta(ItensCarrinho novoitem) {
		this.cesta.add(novoitem);
	}

	@SuppressWarnings("unchecked")
	public void exibircesta(){
		
		for(int x=0;x<((Collection<ItensCarrinho>) cesta.get(x)).size();x++) {
        	System.out.println(this.cesta.get(x).getProdutoName() + this.cesta.get(x).getValor() + this.cesta.get(x).getQtd()); //exibir o nome tb      	
        }
	}
}
