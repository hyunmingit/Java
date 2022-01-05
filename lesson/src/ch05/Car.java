package ch05;

public class Car {
	
	//자동차 속성
	
	private String name;
	private String color;
	private int speed;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	//기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println("자동차 이름 : "+this.name);
		System.out.println("자동차 색상 : " +this.color);
		System.out.println("자동차 현재속도 : "+this.speed+"km/h ");
	}
	
	
	
	

}
