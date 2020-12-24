package project.staff.attendance;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class Get_ci_result {

	String check = null;
	HikariDataSource ds = null;
	public Get_ci_result(int emp_id) {	
		ds = new Hikariconfig().config();
	
	      
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
