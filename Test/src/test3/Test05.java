package test3;


class Vehivle{
	private String name;
	private int price;
	
	public Vehivle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("=================");
		System.out.println("name : " +name);
		System.out.println("price : " +price);
		System.out.println("-----------------");
	}
	
}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehivle createCar(String name, int price) {
		return new Vehivle(name, price);
	}
}





public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Vehivle avante = factory.createCar("Avante", 2500);
		Vehivle sonata = factory.createCar("Sonata", 3000);
		
		avante.info();
		sonata.info();
		
		
		
		
		
		
	}

}
