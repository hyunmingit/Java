package ch06;
/*
 * 날짜 2022.01.05
 * 이름 장현민
 * 내용 자바 다형성 실습하기 P205
 * 
 * 다형성 (Polymorphism)
 * -하나의 기능이 여러 기능으로 변하는 성질
 * -상속 관계에서 부모 클래스의 기능을 자식에서 다시 재정의
 *  같은 메서드를 자식에서 실행하면 부모에게서 참조한 메서드를 자식이 덮어씀(구체화 함)
 * -
 */
public class Sub2_PolyTest {
	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();				
	    Lion lion = new Lion();	 
	    Shark shark = new Shark();
	    
	    eagle.move();
		lion.move();
		shark.move();
		System.out.println("================");
		eagle.hunt();
		lion.hunt();
		shark.hunt();
		
		
		
		
		
		
		
	}

}
