package ch05;
/*
 * 날짜 2022.01.05
 * 이름 장현민
 * 내용 자바 Static 실습 
 * 
 * 정적 변수(클래스 변수)
 *  - 클래스에서 static을 선언한 멤버변수
 *  - 메모리에서 하나의 변수로 관리
 *  - 클래스 타입으로 직접 참조 할 수 있다.
 *  
 * 정적 메서드 (클래스 메서드)
 *  - 클래스에서 static을 선언한 멤버 메서드
 *  - 메모리에서 하나의 메서드로관리
 *  - 클래스 타입으로 직접 호출 할 수 있다
 * 
 */
public class Sub2_StaticTest {
	
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//정적변수, 정적메서드는 클래스 이름으로 직접 참조.
		Increment.num2 = 0;
		Increment.add();
		
	}
	
	

}
