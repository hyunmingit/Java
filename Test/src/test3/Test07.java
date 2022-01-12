package test3;


class Customer   {
	protected int id;
	protected int point;
	protected String name;
	protected String grade;
	protected double pointRatio;
      
	
	
	
	
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SIVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	public int calcPrice(int price) {
		point +=price * pointRatio;
		return price;
	}
	public void showInfo() {
		System.out.println("==================");
		System.out.println("ID : "+id);
		System.out.println("Name : " +name);
		System.out.println("Grade : " +grade);
		System.out.println("Point : "+point);
		System.out.println("Point Rotio : "+pointRatio);
	}
	
}

class VipCustomer extends Customer{
	
	private double saleRatio;
	
	public VipCustomer(int id, String name) {
		super(id, name);
		super.grade = "vip";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
				
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price * saleRatio);
	}
	
	
}





public class Test07 {
	public static void main(String[] args) {
		
		Customer kim = new Customer(1001, "±Ë√·√ﬂ");
		VipCustomer lee = new VipCustomer(1002, "¿Ãº¯Ω≈");
		
		System.out.println("±Ë√·√ﬂ¿« ∞°∞› : " +kim.calcPrice(10000));
		System.out.println("¿Ãº¯Ω≈¿« ∞°∞› : " +lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
		
		
	}

}
