package ch12;

import java.sql.DriverManager;
import java.sql.Statement;



public class Sub02_Insert {public static void main(String[] args) {
	
	final String Host = "jdbc:mysql://54.180.160.240:3306/jhmcos13";
	final String User = "jhmcos13";
	final String Pass = "1234";
	
	try {
	
		//1 JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2 �����ͺ��̽� ����
		java.sql.Connection conn = DriverManager.getConnection(Host, User, Pass);
		
		//3 SQL���� ��ü����(statement)
		Statement stmt = conn.createStatement();
		
		//4 SQL ����
		String sql = "INSERT INTO `User1` VALUES('P101', '���߱�', '010-1010-1234', 31);";
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count+"���� �����Ͱ� �߰��Ǿ����ϴ�.");
		
		
		//5 ���ó�� (SELECT�� ���)
		//6 �����ͺ��̽� ����
		conn.close();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("Insert Complete...");
	
	
	
	
	
	
	
}

}
