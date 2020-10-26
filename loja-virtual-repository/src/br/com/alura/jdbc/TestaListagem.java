package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
//		Connection connection = DriverManager
//				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "4312");
		
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO"); // pra poder chamar
		stm.execute();
		ResultSet rst = stm.getResultSet(); // traz e mostra os resultados
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			String nome = rst.getString("nome");
			String descricao = rst.getString("DESCRICAO");
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
		}
		connection.close();
		
		
	}

}
