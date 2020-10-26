package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.RuntimeErrorException;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {
		String nome ="Mouse";
		String descricao = "Mousem sem fio";
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		connection.setAutoCommit(false); //tirando commit automatico do banco de dados
		try (
			PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS); // pra poder chamar
			){
			adicionarVariavel("SmartTV","45 polegadas", stm);
			adicionarVariavel("Chave Phillips","Fenda 3/4", stm);
			
			connection.commit(); //se n tiver excecao faz o commit
			
			stm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ROLLBACK EXECUTADO");
			connection.rollback(); //desfazendo commit
		}
		
	}
	

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
//		if(nome.equals("Chave Phillips")) {
//			throw new RuntimeException("Não foi possível adicionar o produto");
//		}
		stm.execute();
		
		try(ResultSet rst = stm.getGeneratedKeys()){ // traz e mostra os resultados
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("ID criado: "+ id);
		}
		}
	}

}
