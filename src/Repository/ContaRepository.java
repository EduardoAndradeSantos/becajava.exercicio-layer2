package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Conta;

public class ContaRepository {
	
	
	private List<Conta> listaDeConta = new ArrayList<Conta>();

	//guarda as listas das contas
	public List<Conta> adicionarConta(Conta conta) {
		listaDeConta.add(conta);
		return listaDeConta;
	}
	
	public List<Conta> getListaDeConta() {
		return listaDeConta;
	}

	public void setListaDeConta(List<Conta> listaDeConta) {
		this.listaDeConta = listaDeConta;
	}
	
	public Conta GetConta(int indice) {

        Conta conta = new Conta();


        conta = new Conta();
        conta.nome = "Silvio";
        conta.cpf = "00000000";
        conta.agencia = "101";
        listaDeConta.add(conta);

       
        
       
        conta = new Conta(); 
        conta.nome = "joao";
        conta.cpf = "00000000";
        conta.agencia = "202";
        listaDeConta.add(conta);
    
         
        



        conta = new Conta();
         
        conta.nome = "maria";
        conta.cpf = "00000000";
        conta.agencia = "300";
        
        
        listaDeConta.add(conta);



        conta = new Conta();
         
        conta.nome = "fulano";
        conta.cpf = "00000000";
        conta.agencia = "290";
        
        
        listaDeConta.add(conta);


        return listaDeConta.get(indice);
        

    }
	
	public Conta GetContaa(int index) {

        Conta conta = new Conta();
        


        conta.nome = "Silvio";
        conta.cpf = "00000000";
        conta.agencia = "20202";
        conta.saldo = 300;
        
        
        listaDeConta.add(conta);

        conta.nome = "joao";
        conta.cpf = "00000000";
        conta.agencia = "20202";
        conta.saldo = 400;
        
        listaDeConta.add(conta);



        conta.nome = "maria";
        conta.cpf = "00000000";
        conta.agencia = "20202";
        conta.saldo = 500;
        
        listaDeConta.add(conta);



        conta.nome = "fulano";
        conta.cpf = "00000000";
        conta.agencia = "20202";
        conta.saldo = 600;
        
        listaDeConta.add(conta);

      


        return listaDeConta.get(index);
        
        

    }
	
	

}
