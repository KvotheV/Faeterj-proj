package banco;

import java.util.ArrayList;
import java.util.List;


public class Conta {
	
    double saldo=0;
    List<String> extrato = new ArrayList<String>();
    
    boolean saca(double valor) {
        if (this.saldo < valor) {
        	extrato.add("Saldo Nao suficiente para efetuar a operacao.");
            return false;
 
        } else {
            this.saldo = this.saldo - valor;
            extrato.add("Saque de " + valor + " efetuado");
            return true;
        }
    }
 
    boolean pagamento(double valor) {
        if (this.saldo < valor) {
        	extrato.add("Saldo Nao suficiente para efetuar a operacao.");
            return false;
 
        }
        else {
            this.saldo = this.saldo - valor;
            extrato.add("pagamento no de " + valor + " foi efetuado");
            return true;
        }
    }
    
    void deposita(double valor) {
        this.saldo += valor; 
        extrato.add("deposito de " + valor + " efetuado");
    }
    
}