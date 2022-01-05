package ch06;

// 추상 클래스 : 상속을 위한 클래스, 1개 이상의 추상메서드를 갖는 클래스
public abstract class Unit {
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	public abstract void attack(); //추상 메서드

}
