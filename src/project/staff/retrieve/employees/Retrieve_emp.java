package project.staff.retrieve.employees;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class Retrieve_emp {
   String emp_info = null;
   HikariDataSource ds = null;
   public Retrieve_emp(String name) {
	   ds = new Hikariconfig().config();
      
      try {
         Connection conn = ds.getConnection();

         PreparedStatement pstmt = conn.prepareStatement("SELECT emp_id, department_name, job_position, salary, emp_phone FROM employees3 e INNER JOIN departments3 d USING (department_id) WHERE emp_name = ?");

         pstmt.setString(1, name);
         
         ResultSet rs = pstmt.executeQuery();

         
         while (rs.next()) {
        	 emp_info = String.format("[" + name + "]����� ����\n" + "����ID: %d\n�μ��̸�: %s\n��å: %s\n����: %d\n��ȭ��ȣ: %s\n\n--------------------------------------------------------------------------------------------------\n\n", 
            		rs.getInt("emp_id"),
            		rs.getString("department_name"),
            		rs.getString("job_position"),
            		rs.getInt("salary"),
            		rs.getString("emp_phone"));
         }
         
         if (emp_info == null) {
        	 emp_info = "[" + name + "]����� �������� �ʴ� ����Դϴ�.\n\n---------------------------------------------------------------------------------------------------\n\n";
         }

         rs.close();
         pstmt.close();
         conn.close();

      } catch (SQLException e) {
         e.printStackTrace();
      }      
   }
   
   public String info() {
      
      return emp_info;
   }

}