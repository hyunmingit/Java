package test3;
//00
public class Test01 {
	private String name;
	private int age;
	
	public Test01(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void show() {
		System.out.println("=================");
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.age);
		System.out.println("-----------------");
	}
	public static void main(String[] args) {
		
		Test01 kim = new Test01("������", 23);		
		Test01 lee = new Test01("�̼���", 31);	
		
		kim.show();
		lee.show();
		
		
		
		
		
	}

}
