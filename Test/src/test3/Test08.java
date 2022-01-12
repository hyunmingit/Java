package test3;



class Product {
	
	protected String category;    //상속은 프로텍티드
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
		
	}
	public void info() {}
}




class Television extends Product{
	public Television(String category, int price) {
		super(category, price);
	}
	
	public void info() {
		System.out.println("Category : "+category);
		System.out.println("Price : "+price);
	}
}


class Computer extends Product{
	public Computer(String category, int price) {
		super(category, price);
	}
	public void info() {
		System.out.println("Category : "+category);
		System.out.println("Price : "+price);
	}
}













public class Test08 {
	public static void main(String[] args) {
		
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		p1.info();
		p2.info();
		
		
		
		
	}

}
