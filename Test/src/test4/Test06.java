package test4;


class Apple{
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}



class Banana{
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}


class Grape{
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}







public class Test06 {
	public static void main(String[] args) {
		
		Test06 test = new Test06();
		
		Apple apple = new Apple("Korea", 3000);
		Banana banana = new Banana("philiphin", 2000);
		Grape grape = new Grape("America", 3000);
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
		
	}
	public void showInfo(Object fruit) {
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			apple.show();
		}else if (fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			banana.show();
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			grape.show();
		}
	}

}
