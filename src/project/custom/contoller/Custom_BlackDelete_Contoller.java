package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class Custom_BlackDelete_Contoller {

	HikariDataSource ds = null;
	
	public Custom_BlackDelete_Contoller() {
		ds = new Hikariconfig().config();
	}
	
	public void BlackDelte(String card) {

	      try {
			Connection conn = ds.getConnection();
			String noblack = "No_Black";
			String sql = "DELETE FROM blacklist WHERE CARD = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, card);		
			System.out.println("ī�� ��ȣ�� ������Ʈ ����  �Ϸ�");
			pstmt.executeUpdate();
						
			String sql2 = "UPDATE CUSTOM SET black_whether = '" + noblack + "' WHERE CARD = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, card);
			System.out.println("ȸ�� ���� ����� NO_BLACK ��ȯ �Ϸ�");
			pstmt2.executeUpdate();
			
			if(pstmt != null) pstmt.close();
			if(pstmt2 != null) pstmt2.close();
			if(conn != null) conn.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	}
	
	
}
