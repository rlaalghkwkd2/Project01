package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class CustomAndBlack_Table_Delete {
	String practiceType;
	public CustomAndBlack_Table_Delete(String startOrEnd) {
		this.practiceType = startOrEnd;
		  if(practiceType.equalsIgnoreCase("start")) {
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
				
				String sql= "DROP TABLE BLACKLIST";		
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				String sql2 = "DROP TABLE CUSTOM";
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				pstmt2.executeUpdate();
				String sql3 = "PURGE RECYCLEBIN";
				PreparedStatement pstmt3 = conn.prepareStatement(sql3);
				pstmt3.executeUpdate();
				
				if(pstmt != null) pstmt.close();	
				if(pstmt2 != null) pstmt.close();	
				if(pstmt3 != null) pstmt.close();	
				if(conn != null) conn.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		  }else if (practiceType.equalsIgnoreCase("end")){
			  return;
		  }
	}
	
}
