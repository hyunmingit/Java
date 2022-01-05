package ch05;

public class Account {

	//속성(필드)
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	///protected : 상속관계에서는 자식 클래스에서 참조 할수있도록 한다.
	
	
	//생성자(constructor) : 객체 생성 할 때 멤버 변수를 초기화 하는 메서드
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//기능은 외부요인이라서 퍼블릭
	public void deposit (int won) {
		this.balance += won;
	}
	public void withdraw(int won) {
		this.balance -= won;
	}
	public void show() {
		System.out.println("======================");
		System.out.println("은행명 : " +this.bank);
		System.out.println("계좌번호 : " +this.id);
		System.out.println("입금주 : " +this.name);
		System.out.println("현재 잔액 : "+this.balance+"원");
		System.out.println("======================");
		
	}
	
	
	
	
}
