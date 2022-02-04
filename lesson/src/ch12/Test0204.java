package ch12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Test0204 {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://chhak.or.kr/jhmcos13";
		final String User = "jhmcos13";
		final String Pass = "1234";	
		
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(Host, User, Pass);
			Statement stmt = conn.createStatement();
			System.out.println("��ǰ �ֹ� �ý��ۿ� ���Ű��� ȯ���մϴ�..");
			
			while(true) {
				System.out.println("0:����, 1:��ǰ��ȸ, 2:��ǰ�ֹ�");
				System.out.print("���� : ");
				int answer = sc.nextInt();
				
				if(answer == 0) {
					//����
					break;
				}else if (answer == 1) {
					String sql = "SELECT * FROM `TestProduct`;";
					ResultSet rs = stmt.executeQuery(sql);
					
					System.out.println("---------- ��ǰ��ȸ -----------");
					System.out.println("|��ȣ|��ǰ�̸�|����|");
					
					while(rs.next()) {
						String productId = rs.getString(1);
						String pName = rs.getString(2);
						int price = rs.getInt(4);
						System.out.printf("|%s|%s|%d|\n", productId, pName, price);
					}
					System.out.println("-----------------------------");
				}else if(answer == 2) {
					//�ֹ�
					while(true) {
						System.out.println("---------- ��ǰ�ֹ� -----------");
						System.out.print("����ȣ �Է� : ");
						String custId = sc.next();
						
						System.out.print("��ǰ��ȣ �Է� : ");
						String productId = sc.next();
						
						System.out.print("�ֹ����� �Է� : ");
						int orderCount = sc.nextInt();
						
						sc.nextLine();
						System.out.print("��ǰ ����� �Է� : ");
						String orderAddress = sc.nextLine();
						
						String sql = "INSERT INTO `TestOrder` SET";
							   sql += "`orderer`='"+custId+"', ";	
							   sql += "`orderProduct`='"+productId+"', ";	
							   sql += "`orderCount`="+orderCount+", ";	
							   sql += "`orderAddress`='"+orderAddress+"', ";
							   sql += "`orderDate` =NOW();";
							   
						try {
							stmt.executeUpdate(sql);													
						}catch (Exception e) {
							System.out.println("����ȣ �Ǵ� ��ǰ��ȣ�� �ٽ� Ȯ���ϱ�� �ٶ��ϴ�.");
							continue;
						}
						break; 
						
							   
					}
					System.out.println("��ǰ�ֹ��� �Ϸ� �Ǿ����ϴ�.");
					System.out.println("-----------------------------");
					
					
					
				}	
					
				
			}
			conn.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("���α׷� ����...");
		
		
	}

}
