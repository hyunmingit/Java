package ch07;

public class P158 {
	public static void main(String[] args) {
		//직접 실행
		Method.printName();
		
		//객체 생성해서 실행
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
		printId(); //다른 메서드 실행
	}
	void printId() {
		System.out.println("printId() work");
	}
}
