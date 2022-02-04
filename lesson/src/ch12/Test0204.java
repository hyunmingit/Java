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
			System.out.println("상품 주문 시스템에 오신것을 환영합니다..");
			
			while(true) {
				System.out.println("0:종료, 1:상품조회, 2:상품주문");
				System.out.print("선택 : ");
				int answer = sc.nextInt();
				
				if(answer == 0) {
					//종료
					break;
				}else if (answer == 1) {
					String sql = "SELECT * FROM `TestProduct`;";
					ResultSet rs = stmt.executeQuery(sql);
					
					System.out.println("---------- 상품조회 -----------");
					System.out.println("|번호|상품이름|가격|");
					
					while(rs.next()) {
						String productId = rs.getString(1);
						String pName = rs.getString(2);
						int price = rs.getInt(4);
						System.out.printf("|%s|%s|%d|\n", productId, pName, price);
					}
					System.out.println("-----------------------------");
				}else if(answer == 2) {
					//주문
					while(true) {
						System.out.println("---------- 상품주문 -----------");
						System.out.print("고객번호 입력 : ");
						String custId = sc.next();
						
						System.out.print("상품번호 입력 : ");
						String productId = sc.next();
						
						System.out.print("주문수량 입력 : ");
						int orderCount = sc.nextInt();
						
						sc.nextLine();
						System.out.print("상품 배송지 입력 : ");
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
							System.out.println("고객번호 또는 상품번호를 다시 확인하기시 바랍니다.");
							continue;
						}
						break; 
						
							   
					}
					System.out.println("상품주문이 완료 되었습니다.");
					System.out.println("-----------------------------");
					
					
					
				}	
					
				
			}
			conn.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("프로그램 종료...");
		
		
	}

}
