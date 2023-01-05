package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
	
	public void testTransaction() {
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
	
			conn.setAutoCommit(false);

			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			//simular uma falha na transação
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error: class transaction is working!!!");
			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			//dar commit na transação caso ela tenha funcionado
			conn.commit();
			
			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} 
			//tratamento do rollback, pois ele também pode dar erro
			catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
