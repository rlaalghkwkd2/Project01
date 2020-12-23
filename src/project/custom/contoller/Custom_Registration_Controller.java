package project.custom.contoller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.custom.main.Create_card;

public class Custom_Registration_Controller {
	Create_card cards = new Create_card();
	
	public static String name;
	public static int age;
	public static String gender;
	public static String email;
	public static String phone;
	public static String addr;
	public static String card;
	public static String black;
	
public void Custom_insert_create_table_info(String name, int age, String gender,String phone, String email,  String addr) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
		this.card = cards.inputCard();
	 
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/simpsons");
		config.setUsername("bart");
		config.setPassword("51mp50n");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		HikariDataSource ds = new HikariDataSource(config);
	      try {
	    	boolean flag = false;
	    	
			Connection conn = ds.getConnection();
			String sql = "INSERT INTO custom values(custom_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?)";		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,this.name);
			pstmt.setInt(2, this.age);
			pstmt.setString(3, this.gender);
			pstmt.setString(4, this.phone);
			pstmt.setString(5, this.email);
			pstmt.setString(6, this.addr);
			pstmt.setString(7, this.card);
			pstmt.setString(8, "No_Black");
			flag = true;
			System.out.println("�ű� ȸ�� ��� �Ϸ�");
			
			pstmt.executeUpdate();
						
			
		
			
			
			String sql2 = "CREATE TABLE ABC"+ this.card			
			+" (SALES_NUMBER NUMBER(4),"
			+"SH_NAME VARCHAR2(40),"
			+"SH_COUNT NUMBER(3),"
			+"SH_SIZE NUMBER(3),"
			+"SH_PRICE NUMBER(8),"
			+"Purchase_day varchar(30),"
			+"CURRENT_POINT NUMBER(8) DEFAULT 0,"
			+"shoes_serial_number NUMBER(7),"
			+"SH_ID NUMBER(3))";
			
//			+" CONSTRAINT Purchaseday_nn"+this.card+" NOT NULL,"
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			System.out.println("ȸ�� ���� ����� ����");
			pstmt2.executeUpdate();
						
			String sql3 = "commit";
			PreparedStatement pstmt3 = conn.prepareStatement(sql3);
			pstmt3.executeUpdate();
			
			if(pstmt != null) pstmt.close();
			if(pstmt2 != null) pstmt.close();
			if(pstmt3 != null) pstmt.close();
			if(conn != null) conn.close();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}

	



	}
