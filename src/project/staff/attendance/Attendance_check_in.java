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

public class Attendance_check_in {
	String result;
	HikariDataSource ds = null;
	public Attendance_check_in(int emp_id) {	
		
		ds = new Hikariconfig().config();
		
		try {
			Connection conn = ds.getConnection();
		
			
			String sql = "INSERT INTO attendance (check_date, check_in_time, emp_id, emp_name, attendance_check) VALUES (?, ?, ?, ?, ?)";

			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			String today = new Today().check_day();
			if (new Get_check_in_today(emp_id, today).checked_in == null) {
				if (new Get_name(emp_id).name() == null) {
					System.err.println("�������� �ʴ� �����ȣ �Դϴ�.");
					result = "[" + emp_id + "]���� �������� �ʴ� �����ȣ �Դϴ�.";
				} else {
				pstmt.setString(1, new Attendance_ci().check_day());
				pstmt.setString(2, new Attendance_ci().check_time());
				pstmt.setInt(3, emp_id);
				pstmt.setString(4, new Get_name(emp_id).name());
				pstmt.setString(5, new Attendance_ci().attendance_result());
	
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
			e.printStackTrace();
		}
	}
	
	public String result() {
		
		return result;
	}

}
