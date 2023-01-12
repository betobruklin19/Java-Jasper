package java_jasper.java_jasper;

import org.junit.Test;

import conexao_jdbc.SingleConnection;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}

}
