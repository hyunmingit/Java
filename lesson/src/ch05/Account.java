package ch05;

public class Account {

	//�Ӽ�(�ʵ�)
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	///protected : ��Ӱ��迡���� �ڽ� Ŭ�������� ���� �Ҽ��ֵ��� �Ѵ�.
	
	
	//������(constructor) : ��ü ���� �� �� ��� ������ �ʱ�ȭ �ϴ� �޼���
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//����� �ܺο����̶� �ۺ�
	public void deposit (int won) {
		this.balance += won;
	}
	public void withdraw(int won) {
		this.balance -= won;
	}
	public void show() {
		System.out.println("======================");
		System.out.println("����� : " +this.bank);
		System.out.println("���¹�ȣ : " +this.id);
		System.out.println("�Ա��� : " +this.name);
		System.out.println("���� �ܾ� : "+this.balance+"��");
		System.out.println("======================");
		
	}
	
	
	
	
}
