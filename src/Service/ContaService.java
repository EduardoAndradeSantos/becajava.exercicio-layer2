package Service;

import java.util.List;

import Model.Conta;
import Repository.ContaRepository;

public class ContaService {
	private ContaRepository repository = new ContaRepository();

	public List<Conta> adicionarConta(Conta conta) {
		//verifica se é vazia ou nula e retorna a mensagem cpf inválido
		if (conta.getCpf().isEmpty() || conta.getCpf() == null) {
			throw new RuntimeException("CPF Inválido");
		}
		return repository.adicionarConta(conta);
	}
	
	
	public List<Conta> alterarConta(Conta conta) {
		Integer contador = 0;
		List<Conta> listaDeConta = repository.getListaDeConta();
		for (Conta conta2 : listaDeConta) {
			if(conta2.getAgencia().equals(conta.getAgencia()) && 
			   conta2.getNumeroConta().equals(conta.getNumeroConta())) {
			   listaDeConta.get(contador).setSaldo(conta.getSaldo());	
			}
			contador++;
		}
		
		repository.setListaDeConta(listaDeConta);
		return repository.getListaDeConta();
	}
}
