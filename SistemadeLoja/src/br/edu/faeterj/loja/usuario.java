package br.edu.faeterj.loja;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unused")
public class usuario {

	public static void main(String[] args) throws IOException {
		int fim=0;	
		//carrega logins da loja
		ListasLoja loginsl;
		loginsl = new ListasLoja();
		loginsl.leArquivo("/trabalho 3 oo1/src/br/edu/faeterj/loja/clientes.csv"); //foi criada uma lista de objetos login para ser consultada no momento do login
		
		//----------------------------------------------------
		/*for(int i=0;i<loginsl.listalogin.size();i++) {
        	System.out.println("nome :" + loginsl.listalogin.get(i).getNome() + "\nemail :" + loginsl.listalogin.get(i).getEmail() + "\n" + loginsl.listalogin.get(i).getSenha());       	
        }*/	
		//-----------------------------------------------------
		
		//login	------------------------------------------------
		System.out.println("Login Screen\n\nEmail: ");
		LeitorTeclado leTecla = new LeitorTeclado();

		String aux = leTecla.leTeclado();
		for(int i = 0; i < loginsl.listalogin.size(); i++) {
			//System.out.println(loginsl.listalogin.get(i).getEmail());
			if(loginsl.listalogin.get(i).getEmail().equals(aux) == true){
				System.out.println("Email na base de dados\nAgora digite sua senha: ");
				String aux2 = leTecla.leTeclado();
				if(loginsl.listalogin.get(i).getSenha().equals(aux2) == true) {
					System.out.println("Login Aprovado\n");
					//programa continua aqui
					
					//carrega lista produtos.txt e cria objetos <produto>
					loginsl.leArquivoP("J:\\produtos.csv");
					while (fim != 1){
					System.out.println("Lista de produtos: ");
					for(int j=0;j<loginsl.listaprodutos.size();j++) {
			        	System.out.println("ID: " + loginsl.listaprodutos.get(j).getId() ); 
			        	System.out.println("Nome: " + loginsl.listaprodutos.get(j).getNome() );
			        	System.out.println("Nome: " + loginsl.listaprodutos.get(j).getPeso() );
			        	System.out.println("Nome: " + loginsl.listaprodutos.get(j).getPreco() );
			        	System.out.println("Nome: " + loginsl.listaprodutos.get(j).getEstoque() );
			        }	
					System.out.println("Escreva a ID do produto desejado: ");
					String aux3 = leTecla.leTeclado();//checar se cria algum problema aqui
					ItensCarrinho[] ItensC = null; 
					for(int j=0;j<loginsl.listaprodutos.size();j++) {
						if(loginsl.listaprodutos.get(j).getId().equals(aux3) == true) {
							System.out.println("produto encontrado" + "preco:" + loginsl.listaprodutos.get(j).getPreco());
							System.out.println("quantos deste produto irá comprar?");
							int aux4 = Integer.parseInt(leTecla.leTeclado());
							 
							System.out.println("Confirmar compra?(sim/nao)");
							String aux5 = leTecla.leTeclado();
							if(aux5.equals("sim")) {
								ItensC[0] = new ItensCarrinho(loginsl.listaprodutos.get(j), aux4);//transformar esse [0] em um i da vida aí
								loginsl.listalogin.get(i).novoitemcesta(ItensC[0]);
								
								System.out.println("Irá realizar mais alguma compra?(sim/nao)");
								String aux6 = leTecla.leTeclado();
								if(aux6.equals("nao")) {
								
							        	System.out.println("Extrato :\n");  
							        	loginsl.listalogin.get(i).exibircesta();
							       
									fim=1;
								}
							}							
						}
					}
   				}

				}
			}		
		}
	}
}
