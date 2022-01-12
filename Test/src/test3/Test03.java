package test3;
//정답
class Car{
	private String brand;
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void drice() {
		System.out.println(name+" driving...");
	}
	
	public void info() {
		System.out.println("brand : " +brand);
		System.out.println("name : " +name);
		System.out.println("price : " +price);
	}
}











public class Test03 {
	public static void main(String[] args) {
		
		Car sonata = null;
		Car bmw = null;
		
		sonata = new Car("현대", "소나타", 3000);
		bmw = new Car("BMW", "520d", 5000);
		
		sonata.drice();
		sonata.info();
		
		bmw.drice();
		bmw.info();
				
				
		
		
		
		
	}

}
