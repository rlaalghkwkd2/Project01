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

public class Get_checked_in {
	String checked_in = null;
	HikariDataSource ds = null;
	public Get_checked_in(int emp_id) {
		
		ds = new Hikariconfig().config();
	      try {
	         Connection conn = ds.getConnection();

	         PreparedStatement pstmt = conn.prepareStatement("SELECT check_in_time FROM attendance WHERE emp_id = ?");

	         pstmt.setInt(1, emp_id);
	         
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
