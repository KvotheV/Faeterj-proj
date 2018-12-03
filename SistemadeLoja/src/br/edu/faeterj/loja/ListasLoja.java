package br.edu.faeterj.loja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasLoja {
	List<login> listalogin= new ArrayList<login>();
	List<produto> listaprodutos= new ArrayList<produto>();
	private Scanner leitor;
	
	
	public void leArquivo(String nomeArquivo) throws IOException {
		
	       //abre um arquivo e cria um file
	       File arquivoCSV = new File(nomeArquivo);
	       int i=0;
	       login pessoa[] = new login[200];
	       
	        try{
	        	
	        	
	            leitor = new Scanner(arquivoCSV);
	            
	            //variavel que armazenara as linhas do arquivo
	            String linhasDoArquivo = new String();
	            
	            //ignora a primeira linha do arquivo
	            //leitor.nextLine();
	            
	            //percorre todo o arquivo
	            while(leitor.hasNext()){
	            	pessoa[i] = new login();
	                //recebe cada linha do arquivo
	                linhasDoArquivo = leitor.nextLine();
	                
	                //separa os campos entre as virgulas de cada linha
	                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");             
	                
	                //imprime a coluna que quiser
	                pessoa[i].setNome(valoresEntreVirgulas[0]);
	                pessoa[i].setEmail(valoresEntreVirgulas[1]);
	                pessoa[i].setSenha(valoresEntreVirgulas[2]);
	                pessoa[i].setNcartao(valoresEntreVirgulas[3]);
	                  /*System.out.println(pessoa.getNome());
	                  System.out.println(pessoa.getEmail());
	                  System.out.println(pessoa.getSenha());
	                  System.out.println(pessoa.getNcartao());*/
	                  listalogin.add(pessoa[i]);
	                  i++;
	                  
	            }      	          			                  
	        }catch(FileNotFoundException e){
	            
	        }
	        
	    }

	
	public void leArquivoP(String nomeArquivo) throws IOException {
		
	       //abre um arquivo e cria um file
	       File arquivoCSV = new File(nomeArquivo);
	       int i=0;
	       produto produtos[] = new produto[200];
	       
	        try{
	        	
	        	
	            leitor = new Scanner(arquivoCSV);
	            
	            //variavel que armazenara as linhas do arquivo
	            String linhasDoArquivo = new String();
	            
	            //ignora a primeira linha do arquivo
	            //leitor.nextLine();
	            
	            //percorre todo o arquivo
	            while(leitor.hasNext()){
	            	produtos[i] = new produto();
	                //recebe cada linha do arquivo
	                linhasDoArquivo = leitor.nextLine();
	                
	                //separa os campos entre as virgulas de cada linha
	                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");             
	                
	                //imprime a coluna que quiser
	                produtos[i].setId(valoresEntreVirgulas[0]);
	                produtos[i].setNome(valoresEntreVirgulas[1]);
	                produtos[i].setPeso(Double.parseDouble(valoresEntreVirgulas[2]));
	                produtos[i].setPreco(Double.parseDouble(valoresEntreVirgulas[3]));
	                produtos[i].setEstoque(Integer.parseInt(valoresEntreVirgulas[4]));
	                  /*System.out.println(pessoa.getNome());
	                  System.out.println(pessoa.getEmail());
	                  System.out.println(pessoa.getSenha());
	                  System.out.println(pessoa.getNcartao());*/
	                  listaprodutos.add(produtos[i]);
	                  i++;
	                  
	            }      	          			                  
	        }catch(FileNotFoundException e){
	            
	        }
	        
	    }
}