package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao_jdbc.SingleConnection;
import model.Responsavel;

public class ResponsavelDao {
	
	private Connection connection;
		
		public ResponsavelDao() {
		
			connection = SingleConnection.getConnection();
	
		}
	
	/*
	 * public void salvar(Responsavel Responsavel) { try { String sql = "insert into Responsavel" +
	 * "(id, nome, data_nascimento, cpf, rg, rg_data_emissao, " +
	 * " rg_orgao_expedidor, nome_mae, nome_pai, telefone, sexo_id, raca_cor_id, email, nis) "
	 * + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; PreparedStatement
	 * insert = connection.prepareStatement(sql); insert.setLong(1, 14);
	 * insert.setString(2, "Romario Campos Dankler"); insert.setDate(3,
	 * java.sql.Date.valueOf("2003-09-04")); insert.setString(4, "05784712104");
	 * insert.setString(5, "78741000233"); insert.setDate(6,
	 * java.sql.Date.valueOf("2015-03-05"));; insert.setInt(7, 8871);
	 * insert.setString(8, "Marcia Figueira Alves"); insert.setString(9,
	 * "Claudenir Alves Ramos"); insert.setString(10, "(79)8749-9873");
	 * insert.setInt(11, 1); insert.setInt(12, 2); insert.setString(13,
	 * "teste@email.com"); insert.setString(14, "0410178"); insert.execute();
	 * connection.commit();
	 * 
	 * } catch (Exception e) { try { connection.rollback(); } catch (Exception e1) {
	 * e1.printStackTrace(); } e.printStackTrace(); }
	 * 
	 * }
	 */
	public List<Responsavel> listar () throws Exception{
		List<Responsavel> list = new ArrayList<>();
		
		String sql = "select * from responsavel";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			Responsavel responsavel = new Responsavel();
			responsavel.setId(resultado.getLong("id"));
			responsavel.setNome(resultado.getString("nome"));
			responsavel.setCpf(resultado.getString("cpf"));
			responsavel.setRg(resultado.getString("rg"));
			responsavel.setNic(resultado.getString("nic"));
			responsavel.setTelefone(resultado.getString("telefone"));

			list.add(responsavel);
		}
	
		return list;
	}
}

