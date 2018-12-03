package banco;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    //método principal.
    public static void main(String[] args) {
        //criando a conta
        //variável minha conta do tipo conta.
    	@SuppressWarnings("resource")
    	Conta minhaConta;
        minhaConta = new Conta(); 
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        //deposita xxx reais
        minhaConta.deposita(1000);
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        
        //saca quanto quiser 
        minhaConta.saca(100);
        System.out.println("Saldo atual é: " +minhaConta.saldo);
        
        //pagamento
        minhaConta.pagamento(153.20);
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        
      //deposita xxx reais
        minhaConta.deposita(550);
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        //pagamento
        minhaConta.pagamento(720);
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        
        System.out.println("\nExtrato:\n");
        for(int i=0;i<minhaConta.extrato.size();i++) {
        	System.out.println(minhaConta.extrato.get(i));
        }
    }
}