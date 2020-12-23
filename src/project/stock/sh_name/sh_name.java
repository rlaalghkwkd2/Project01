package project.stock.sh_name;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class sh_name {
	String a = null;

	public sh_name(String name) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1522/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn
					.prepareStatement("select st_info,sh_size,sh_price,br_storage_lct from stock where sh_name=?");

			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				a = String.format("재고수량:%d\n사이즈:%d\n가격:%d\n창고위치:%c\n제품명:%s", rs.getInt("st_info"),
						 rs.getInt("sh_size"),rs.getInt("sh_price"),rs.getString("br_storage_lct"),name);
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String info() {
		return a;
	}

}
