package java_jasper.java_jasper;

import java.util.List;

import org.junit.Test;

import Dao.AlunoDao;
import Dao.ResponsavelDao;
import model.Aluno;
import model.BeanAlunoResponsavel;
import model.Responsavel;

public class TesteBancoJdbc {
	
	@Test
	public void initListarAlunos(){
		AlunoDao dao = new AlunoDao();
		try {
			List<Aluno> list = dao.listar();
			
			for (Aluno aluno : list) {
				System.out.println(aluno);
				System.out.println("-----------------------------------------------");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void initListarReponsaveis(){
		ResponsavelDao dao = new ResponsavelDao();
		try {
			List<Responsavel> list = dao.listar();
			
			for (Responsavel responsavel : list) {
				System.out.println(responsavel);
				System.out.println("-----------------------------------------------");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void testeCarregaAlunoResponsavel() {
		
		AlunoDao dao = new AlunoDao();
		
		List<BeanAlunoResponsavel> beanAlunoResponsavels = dao.listaAlunoResponsavels(1L);
		
		for (BeanAlunoResponsavel beanAlunoResponsavel : beanAlunoResponsavels) {
			System.out.println(beanAlunoResponsavel);
			System.out.println("-----------------------------------------------");
		}
	}
}
