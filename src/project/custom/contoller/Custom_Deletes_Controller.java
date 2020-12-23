package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Custom_Deletes_Controller {


	public void Delete(String card) {
		
		Properties props = new Properties();
	      props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
	      props.setProperty("dataSource.user", "hr");
	      props.setProperty("dataSource.password", "123");
	      props.setProperty("dataSource.databaseName", "XEPDB1");
	      props.put("dataSource.logWriter", new PrintWriter(System.out));
	      
	      HikariConfig config = new HikariConfig(props);
	      HikariDataSource ds = new HikariDataSource(config);  	    
	      try {
			Connection conn = ds.getConnection();
			
			
			String sql3 = "DELETE FROM blacklist WHERE CARD = ?";
			PreparedStatement pstmt3 = conn.prepareStatement(sql3);
			pstmt3.setString(1, card);
			System.out.println("������Ʈ ��� ����");
			pstmt3.executeUpdate();
			
			  String sql ="DELETE FROM CUSTOM WHERE CARD = ?"; 		  
		      PreparedStatement pstmt = conn.prepareStatement(sql);
		      pstmt.setString(1, card);
		      System.out.println("�� ����");		      
		      pstmt.executeUpdate();
		      
		      String sql2 = "DROP TABLE ABC"+card +" PURGE";
		      PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		      System.out.println("�� ���̺� ����");
		      pstmt2.executeUpdate();
		        if(pstmt != null) pstmt.close();
		        if(pstmt2 != null) pstmt2.close();
		        if(pstmt3 != null) pstmt3.close();
				if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
