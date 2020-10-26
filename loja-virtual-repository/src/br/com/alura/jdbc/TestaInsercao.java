package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
	
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement(); // pra poder chamar
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys(); // traz e mostra os resultados
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("ID criado: "+ id);
		}
		connection.close();
		
	}

}
