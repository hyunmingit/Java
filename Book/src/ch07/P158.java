package ch07;

public class P158 {
	public static void main(String[] args) {
		//���� ����
		Method.printName();
		
		//��ü �����ؼ� ����
		Method m = new Method();
		m.printEmail();
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Method {
	static void printName() {
		System.out.println("printName() work");
	}
	
	void printEmail() {
		System.out.println("printEmail() work");
		printId(); //�ٸ� �޼��� ����
	}
	void printId() {
		System.out.println("printId() work");
	}
}
