package ch12;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sub01_JDBC {
	public static void main(String[] args) {
		
		
		//JDBC ���� �׽�Ʈ
		final String Host = "jdbc:mysql://54.180.160.240:3306/jhmcos13";
		final String User = "jhmcos13";
		final String Pass = "1234";
				
		try {
		//1�ܰ�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2
		Connection conn = DriverManager.getConnection(Host, User, Pass) ;
		
		
		
		System.out.println("ok");
		
		
		
		conn.close();
		
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
