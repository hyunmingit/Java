package ch12;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.Scanner;




public class Test0114 {public static void main(String[] args) {
	
	final String Host = "jdbc:mysql://chhak.or.kr/jhmcos13";
	final String User = "jhmcos13";
	final String Pass = "1234";
	
	Scanner sc = new Scanner(System.in);
	
	try {
		
		//1 JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2 �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(Host, User, Pass);
		
		//3 SQL���� ��ü ���� (Statement)
		Statement stmt = conn.createStatement();

		
		while(true) {
			System.out.println("0:����, 1:��� 2:��ȸ 3:�˻�");
			System.out.print("�۾� ���� : ");
			int answer = sc.nextInt();
			
			if (answer == 0) {
				break;
			}else if (answer ==1) {
				
				
				System.out.println("���̵�, �̸� , �޴���, ���� ������ ������ �Է� (����� ����");
				System.out.print("�Է� : ");
				String uid = sc.next();
				String name = sc.next();
				String hp = sc.next();
				int age = sc.nextInt();
				
				String sql = "INSERT INTO `User1` VALUES ('"+uid+"', '"+name+"', '"+hp+"', "+age+");";
				int result = stmt.executeUpdate(sql);
				System.out.println(result+"���� �����Ͱ� ��ϵǾ����ϴ�.");
			}else if(answer ==2) {
				
				String sql = "SELECT * FROM `User1`;";
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("-------������ ��ȸ-------");
				while(rs.next()) {
					
					String uid = rs.getString(1);
					String name = rs.getString(2);
					String hp = rs.getString(3);
					int age = rs.getInt(4);


					System.out.printf("|%s|%s|%s|%d|\n", uid, name, hp, age);
					
					}System.out.println("----------------------");
			}else if (answer ==3) {
				System.out.print("�̸��˻� : ");
				String search = sc.next();
				String sql = "SELECT * FROM `User1` WHERE `name` = '"+search+"';";
				ResultSet rs = stmt.executeQuery(sql);
				
				int count = 0;
				
				System.out.println("-------�˻� ���-------");
				
				while(rs.next()) {
					
					String uid = rs.getString(1);
					String name = rs.getString(2);
					String hp = rs.getString(3);
					int age = rs.getInt(4);
					
					System.out.printf("|%s|%s|%s|%d|\n", uid, name, hp, age);
					count++;
				}if (count == 0) {
					System.out.println(search+"���� ã�� �� �����ϴ�.");
				}
				
				System.out.println("----------------------");
				
				
			}
			
		}
		conn.close();
	}catch (Exception e) {
		e.printStackTrace();
		
	}
	sc.close();
	System.out.println("����...");
	
	
	
	
	
}

}
