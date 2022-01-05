package ch07;

public class P148 {
	public static void main(String[] args) {
		
		//클래스 변수 사용
		System.out.println("Avante 제조사 : "+Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		//인스턴스 변수의 값 변경
		a1.color = "white";
		a2.color = "black";
		
		//인스턴스 변수 출력
		System.out.println("a1 color : "+a1.color);
		System.out.println("a2 color : "+a2.color);
		
		//클래스 변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 : " +a1.company);
		System.out.println("a2 제조사 : " +a2.company);
		
		//클래스 변수의 값 변경
		a1.company = "kia";
		
		//클래스 변수의 값 변경 후 클래스변수와 인스턴스변수 출력
		System.out.println("Avante company : " +Avante.company);
		System.out.println("a1 company : " +a1.company);
		System.out.println("a2 company : " +a2.company);
		
		
		
		
	}

}
class Avante {
	String color;
	static String company = "Hyundai";
	
}
