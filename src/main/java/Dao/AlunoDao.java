package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao_jdbc.SingleConnection;
import model.Aluno;
import model.BeanAlunoResponsavel;

public class AlunoDao {

	private Connection connection;
	
	public AlunoDao() {
		connection = SingleConnection.getConnection();
	}
	
	/*
	 * public void salvar(Aluno aluno) { try { String sql = "insert into aluno" +
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
	public List<Aluno> listar () throws Exception{
		List<Aluno> list = new ArrayList<>();
		
		String sql = "select * from aluno";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			Aluno aluno = new Aluno();
			aluno.setId(resultado.getLong("id"));
			aluno.setNome(resultado.getString("nome"));
			aluno.setData_nascimento(resultado.getDate("data_nascimento"));
			aluno.setCpf(resultado.getString("cpf"));
			aluno.setRg(resultado.getString("rg"));
			aluno.setRg_data_emissao(resultado.getDate("rg_data_emissao"));
			aluno.setRg_orgao_expedidor(resultado.getInt("rg_orgao_expedidor"));
			aluno.setNome_mae(resultado.getString("nome_mae"));
			aluno.setNome_pai(resultado.getString("nome_pai"));
			aluno.setTelefone(resultado.getString("telefone"));
			aluno.setSexo_id(resultado.getInt("sexo_id"));
			aluno.setRaca_cor_id(resultado.getInt("raca_cor_id"));
			aluno.setEmail(resultado.getString("email"));
			aluno.setNis(resultado.getString("nis"));
			
			list.add(aluno);
		}
	
		return list;
	}
	
	public List<BeanAlunoResponsavel> listaAlunoResponsavels (Long id){
		
		List<BeanAlunoResponsavel> beanAlunoResponsavels = new ArrayList<BeanAlunoResponsavel>();
		
		String sql = "select nome,telefone,nic from responsavel res inner join responsavel_aluno res_al ON res_al.id = res.id where res_al.parantesco_id in (1,2)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				BeanAlunoResponsavel alunoResponsavel = new BeanAlunoResponsavel();
				alunoResponsavel.setNome(resultSet.getString("nome"));
				alunoResponsavel.setTelefone(resultSet.getString("telefone"));
				alunoResponsavel.setNic(resultSet.getString("nic"));
				
				beanAlunoResponsavels.add(alunoResponsavel);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
			
		return beanAlunoResponsavels;
	}
}
