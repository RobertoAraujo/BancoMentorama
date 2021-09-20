package br.com.banco.mentorama.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdBanco {
	/*private static final String USUARIO_DB = "root";
	private static final String SENHA_DB = "";
	private static final String URL_DB = "jdbc:mysql://localhost:3306/bancoMentorama";
	
	//method para craiar conexão
	public static Connection criaConexao() throws Exception {
	//  Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL_DB, USUARIO_DB, SENHA_DB);
		System.out.println("Conectou com Sucesso!");
		
		return conn;
	}
	
	public static void fecharConexao(Connection conn){
		try {
			conn.close();
			System.out.println("Fechado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// main de conexao pra testa sua funcionalidade
	public static void main(String[] args) {

		try {
			criaConexao();
			System.out.println("Conectou!");
		} catch (Exception e) {

			System.out.println("Error!");
			e.printStackTrace();
		}
	}*/
	
}
