package project.staff.retrieve.departments;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Retrieve_dpt {

	String dpt_info = null;
	   public Retrieve_dpt(int dpt_id) {
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

	         PreparedStatement pstmt = conn.prepareStatement("SELECT d.department_name, e.manager_id, e.emp_name, e.emp_phone FROM departments3 d INNER JOIN employees3 e USING ( department_id ) WHERE department_id = ?");

	         pstmt.setInt(1, dpt_id);
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	        	 dpt_info = String.format("[" + dpt_id + "번 부서]의 정보\n" + "부서 이름: %s\n매니저ID: %d\n매니저 이름: %s\n전화번호: %s\n\n--------------------------------------------------------------------------------------------------", 
	            		rs.getString("department_name"),
	            		rs.getInt("manager_id"),
	            		rs.getString("emp_name"),
	            		rs.getString("emp_phone"));
	         }
	         
	         if (dpt_info == null) {
	        	 dpt_info = "[" + dpt_id + "번 부서]는 존재하지 않는 부서입니다.\n\n--------------------------------------------------------------------------------------------------";
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }      
	   }
	   
	   public String info() {
	      
	      return dpt_info;
	   }
	
}
