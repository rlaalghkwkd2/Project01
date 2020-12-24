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

public class Get_name {
   public String name = null;
   HikariDataSource ds = null;
   public Get_name(int emp_id) {
	   
	   ds = new Hikariconfig().config();
      try {
         Connection conn = ds.getConnection();

         PreparedStatement pstmt = conn.prepareStatement("SELECT emp_name FROM employees3 WHERE emp_id = ?");

         pstmt.setInt(1, emp_id);
         
         ResultSet rs = pstmt.executeQuery();

         
         while (rs.next()) {
        	 name = rs.getString("emp_name");
         }

         rs.close();
         pstmt.close();
         conn.close();

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   public String name() {
      
      return name;
   }
   
   public static void main(String[] args) {
	   System.out.println(new Get_name(2).name());
}

}