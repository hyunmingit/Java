package ch12;

public class P291 {public static void main(String[] args) {
	
	

	Fruit2 f = new Fruit2("Apple", "Red");
	System.out.println(f);
	
	
	
	
	
	
	
	
	
	
	
}

}
class Fruit2{
	String name;
	String color;
	public Fruit2(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public String toString() {
		return"���� �̸� : "+this.name+"\n���� ���� : "+this.color;
	}
}
