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

public class Retrieve_emp {
   String emp_info = null;
   public Retrieve_emp(String name) {
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

         PreparedStatement pstmt = conn.prepareStatement("SELECT emp_id, department_name, job_position, salary, emp_phone FROM employees3 e INNER JOIN departments3 d USING (department_id) WHERE emp_name = ?");

         pstmt.setString(1, name);
         
         ResultSet rs = pstmt.executeQuery();

         
         while (rs.next()) {
        	 emp_info = String.format("[" + name + "]사원의 정보\n" + "직원ID: %d\n부서이름: %s\n직책: %s\n월급: %d\n전화번호: %s\n\n--------------------------------------------------------------------------------------------------\n\n", 
            		rs.getInt("emp_id"),
            		rs.getString("department_name"),
            		rs.getString("job_position"),
            		rs.getInt("salary"),
            		rs.getString("emp_phone"));
         }
         
         if (emp_info == null) {
        	 emp_info = "[" + name + "]사원은 존재하지 않는 사원입니다.\n\n---------------------------------------------------------------------------------------------------\n\n";
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