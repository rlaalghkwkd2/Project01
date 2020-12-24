package project.staff.attendance;

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
	String result;
	HikariDataSource ds = null;
	public Update_result(int emp_id) {	
		ds = new Hikariconfig().config();
		
		      Connection conn;
			try {
				conn = ds.getConnection();
			 
			String sql = "UPDATE attendance SET attendance_check = ?, check_out_time = ? WHERE emp_id = ? AND check_date = ?";

			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			
			if (new Get_checked_out(emp_id).checked_out == null) {
				if (new Get_name(emp_id).name() == null) {
					System.err.println("�������� �ʴ� �����ȣ �Դϴ�.");
					result = "[" + emp_id + "]���� �������� �ʴ� �����ȣ �Դϴ�.";
				} else {
					if (new Attendance_co().attendance_result() == "�Ἦ") {
						pstmt.setString(1, "�Ἦ");
						pstmt.setString(2, new Attendance_co().check_time());
						pstmt.setInt(3, emp_id);
						pstmt.setString(4, new Attendance_ci().check_day());
					} else if (new Get_ci_result(emp_id).check() == new Attendance_co().attendance_result()) {
						pstmt.setString(1, new Get_ci_result(emp_id).check());
						pstmt.setString(2, new Attendance_co().check_time());
						pstmt.setInt(3, emp_id);
						pstmt.setString(4, new Attendance_ci().check_day());
					} else {
						pstmt.setString(1, new Get_ci_result(emp_id).check());
						pstmt.setString(2, new Attendance_co().check_time());
						pstmt.setInt(3, emp_id);
						pstmt.setString(4, new Attendance_ci().check_day());
					}
	
					int row = pstmt.executeUpdate();
					
					System.out.printf("%d���� ����Ǿ����ϴ�.\n", row);
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					result = "[" + emp_id + "]�� ����� " + "����� �Ϸ�Ǿ����ϴ�.";
				}
			} else {
				System.err.println("�̹� ���üũ�� �Ϸ�� ����Դϴ�.");
				result = "�̹� ���üũ�� �Ϸ�� ����Դϴ�.";
			}
		
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
	public String result() {
		
		return result;
	}
	
}
