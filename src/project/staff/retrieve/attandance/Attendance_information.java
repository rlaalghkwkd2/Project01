package project.staff.retrieve.attandance;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.staff.attendance.Get_name;

public class Attendance_information {
	
	String attendance_check = null;

	public Attendance_information(int emp_id, String check_date) {
		// ��� ��ȣ�� ��¥ �Է� �� ����, ����, �Ἦ ���� ���
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

			PreparedStatement pstmt = conn.prepareStatement("SELECT attendance_check FROM attendance WHERE emp_id = ? AND check_date = ?");

			pstmt.setInt(1, emp_id);
			pstmt.setString(2, check_date);
			

			ResultSet rs = pstmt.executeQuery();

			
			while (rs.next()) {
				attendance_check = "[" + emp_id + "]�� ����� " + check_date + " �⼮ ���� : "  + rs.getString("attendance_check");
			}
			if (new Get_name(emp_id).name == null) {
				attendance_check = "�������� �ʴ� �����ȣ �Դϴ�.";
			} else if (attendance_check == null) {
				attendance_check = String.format("%s�� %d�� ����� ��� ����� �������� �ʽ��ϴ�.", check_date, emp_id);
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String result() {
		
		return attendance_check;
	}
	
}
