package ch06;
/*
 * 날짜 2022.01.05
 * 이름 장현민
 * 내용 자바 클래스 상속 실습하기 P196
 */
public class Sub1_InheritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb증권", "1-12-1234", "buffet", 10000, "flare", 10, 120);
	
	    kb.deposit(1000);
		kb.withdraw(200);
		kb.show();
		
		kb.buy(10,130);
		kb.show();
		
		kb.sell(10, 150);
		kb.show();
	
	
	
	
	
	
	
	}
	
	
	
	

}
