package project.stock.add_new_shoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class add_new_shoes {
	String a = null;
	HikariDataSource ds = null;
	public void add_new_shoess(String sh_serial_number, String sh_name, int sh_size, int st_info, int sh_price,
			String br_storage_lct) {
	
		ds = new Hikariconfig().config();
		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(
					"insert into shoes(sh_serial_number,sh_name,sh_size,st_info,sh_price,br_storage_lct)"
							+ "values(?,?,?,?,?,?)");

			pstmt.setString(1, sh_serial_number);
			pstmt.setString(2, sh_name);
			pstmt.setInt(3, sh_size);
			pstmt.setInt(4, st_info);
			pstmt.setInt(5, sh_price);
			pstmt.setString(6, br_storage_lct);
			System.out.println("�ű� ��ǰ ��� �Ϸ�");
			pstmt.executeUpdate();

			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String info() {
		return a;
	}

	public void storageInput(String sh_serial_number, String sh_name, int sh_size, int sh_info, int sh_price,
			String type) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("123");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();
			String sql = "INSERT INTO storage_" + type + " values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sh_serial_number);
			pstmt.setString(2, sh_name);
			pstmt.setInt(3, sh_size);
			pstmt.setInt(4, sh_info);
			pstmt.setInt(5, sh_price);

			pstmt.executeUpdate();

			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
