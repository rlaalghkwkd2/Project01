package project.staff.event.cut.back;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class Update_result {
	HikariDataSource ds = null;
	public Update_result(String dpt_name) {
		ds = new Hikariconfig().config();
		
		Connection conn;
		try {
			conn = ds.getConnection();
		 
			
			String sql = "UPDATE employees3 SET salary = salary - 50000 WHERE department_id = ( SELECT department_id FROM departments3 WHERE department_name = ? )";

			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			
			pstmt.setString(1, dpt_name);
			
			int row = pstmt.executeUpdate();
			
			System.out.printf("%d행이 변경되었습니다.\n", row);
			System.out.printf("%s 직원들의 월급이 50000원 삭감되었습니다.", dpt_name);
		
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
				
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
