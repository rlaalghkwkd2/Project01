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

public class Get_check_in_today {
	HikariDataSource ds = null;
	String checked_in = null;
	public Get_check_in_today(int emp_id, String check_date) {
		ds = new Hikariconfig().config();
	      
	      try {
	         Connection conn = ds.getConnection();

	         PreparedStatement pstmt = conn.prepareStatement("SELECT check_in_time FROM attendance WHERE emp_id = ? AND check_date = ?");

	         pstmt.setInt(1, emp_id);
	         pstmt.setString(2, check_date);
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	        	 checked_in = rs.getString("check_in_time");
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
	
	public String check_in() {
	      
	      return checked_in;
	   }
	
}
