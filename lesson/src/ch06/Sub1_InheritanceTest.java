package ch06;
/*
 * ��¥ 2022.01.05
 * �̸� ������
 * ���� �ڹ� Ŭ���� ��� �ǽ��ϱ� P196
 */
public class Sub1_InheritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb����", "1-12-1234", "buffet", 10000, "flare", 10, 120);
	
	    kb.deposit(1000);
		kb.withdraw(200);
		kb.show();
		
		kb.buy(10,130);
		kb.show();
		
		kb.sell(10, 150);
		kb.show();
	
	
	
	
	
	
	
	}
	
	
	
	

}
