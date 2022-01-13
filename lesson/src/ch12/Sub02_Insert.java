package ch12;

import java.sql.DriverManager;
import java.sql.Statement;



public class Sub02_Insert {public static void main(String[] args) {
	
	final String Host = "jdbc:mysql://54.180.160.240:3306/jhmcos13";
	final String User = "jhmcos13";
	final String Pass = "1234";
	
	try {
	
		//1 JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2 데이터베이스 접속
		java.sql.Connection conn = DriverManager.getConnection(Host, User, Pass);
		
		//3 SQL실행 객체생성(statement)
		Statement stmt = conn.createStatement();
		
		//4 SQL 실행
		String sql = "INSERT INTO `User1` VALUES('P101', '안중근', '010-1010-1234', 31);";
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count+"개의 데이터가 추가되었습니다.");
		
		
		//5 결과처리 (SELECT일 경우)
		//6 데이터베이스 종료
		conn.close();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("Insert Complete...");
	
	
	
	
	
	
	
}

}
