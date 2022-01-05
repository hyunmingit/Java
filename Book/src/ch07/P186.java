package ch07;

public class P186 {
	
	//static 변수
	private static P186 instance = new P186();
	
	//생성자에 private 접근 제한자
	private P186() {
		System.out.println("객체 생성");
	}
	//static 메서드
	public static P186 getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}

}
