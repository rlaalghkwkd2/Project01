package project.staff.attendance;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Get_ci_result {

	String check = null;
	
	public Get_ci_result(int emp_id) {	
		
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

	         PreparedStatement pstmt = conn.prepareStatement("SELECT attendance_check FROM attendance WHERE emp_id = ? AND check_date = ?");

	         pstmt.setInt(1, emp_id);
	         pstmt.setString(2, new Attendance_ci().check_day());
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	            check = rs.getString("attendance_check");
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }      
	}
	
	public String check() {
		
		return check;
	}
}
