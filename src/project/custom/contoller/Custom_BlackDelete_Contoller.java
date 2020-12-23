package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Custom_BlackDelete_Contoller {

	public void BlackDelte(String card) {
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
			String noblack = "No_Black";
			String sql = "DELETE FROM blacklist WHERE CARD = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, card);		
			System.out.println("카드 번호로 블랙리스트 해제  완료");
			pstmt.executeUpdate();
						
			String sql2 = "UPDATE CUSTOM SET black_whether = '" + noblack + "' WHERE CARD = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, card);
			System.out.println("회원 관리 저장소 NO_BLACK 변환 완료");
			pstmt2.executeUpdate();
			
			if(pstmt != null) pstmt.close();
			if(pstmt2 != null) pstmt2.close();
			if(conn != null) conn.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	}
	
	
}
