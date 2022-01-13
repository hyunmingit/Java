package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sub05_Select {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://54.180.160.240:3306/jhmcos13";
		final String User = "jhmcos13";
		final String Pass = "1234";		
		
		
		try{
			//1 JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			//2 �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(Host, User, Pass);
			
			//3 SQL���� ��ü ���� (Statement)
			Statement stmt = conn.createStatement();
			
			//4 SQL ����
			String sql = "SELECT * FROM `User1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			
			//5 ���ó��(SELECTd�� ���)
			while(rs.next()) {
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println("===================");
				System.out.println("ID : "+uid);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+hp);
				System.out.println("Age : "+age);
				System.out.println("-------------------");
				
				
			}
			//6 �����ͺ��̽� ����
			
			 conn.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Select Complete...");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
