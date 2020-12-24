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

public class Get_checked_out {
	String checked_out = null;
	HikariDataSource ds = null;
	public Get_checked_out(int emp_id) {
		
		ds = new Hikariconfig().config();
	      try {
	         Connection conn = ds.getConnection();

	         PreparedStatement pstmt = conn.prepareStatement("SELECT check_out_time FROM attendance WHERE emp_id = ?");

	         pstmt.setInt(1, emp_id);
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	        	 checked_out = rs.getString("check_out_time");
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
	
	public String check_out() {
	      
	      return checked_out;
	   }
}
