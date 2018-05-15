package view;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.impl.ClienteJDBCDAO;
import entily.Cliente;

public class Principal {
	

	private static String nome;
	private static String cpf;
	private static String fone;
	private static String renda;
	private static String id;

	/**
	 * @param args
	 * @throws SQLException
	 * @throws DAOException 
	 */
	public static void main(String[] args)  {

		ClienteJDBCDAO clienteDAO = new ClienteJDBCDAO();
		Cliente cliente = new Cliente();

		int opcao;
			do {
			opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(""
									+ "Escolha uma das opções abaixo:\n"
									+ "1:Inserir cliente\n"
									+ "2:Atualizar dados do cliente \n"
									+ "3:Obter um cliente por id e exibir suas informacoes\n"
									+ "4:Deletar um cliente por id\n"
									+ "5:Exibir todos os clientes \n"
									+ "6:Sair da aplicação\n"));

			switch (opcao) {
			case 1:
			
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

			default:
				JOptionPane.showMessageDialog(null,	"Fim do Programa");
			}

		} while (opcao < 6);

	}

	
	
	
	

}
