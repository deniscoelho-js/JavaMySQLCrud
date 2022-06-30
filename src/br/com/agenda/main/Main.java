package br.com.agenda.main;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {

		ContatoDAO contatoDAO = new ContatoDAO();

//		Salvar novo contato
		Contato contato = new Contato("Nero Angelo", 19, new Date());
//		contatoDAO.salvarContatoNoBanco(contato);
		
//		cria o novo objeto para atualizar no banco
		Contato c1 = new Contato(1, "Maria Ravena", 88, new Date());
		
//		atualizar o contato no banco
//		contatoDAO.atualizarContatos(c1);
		
//		deletar o contato
//		contatoDAO.deletarContatoPorID(1);
			

		for(Contato c : contatoDAO.listarContatos()) {
			System.out.println(c.getNome() + " - " + c.getIdade() + " anos");
		}
		
	}
}
