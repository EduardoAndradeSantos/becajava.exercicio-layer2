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
}
