package test3;

class Rent {
	public void payment() {
		System.out.println("Get payment...");
	}
}

class Landload extends Rent{
	public void getMoney() {
		System.out.println("Owner...");
		payment();
	}
}

























public class Test06 {
	public static void main(String[] args) {
		
		Landload master = new Landload();
		master.getMoney();
				
		
	}

}
