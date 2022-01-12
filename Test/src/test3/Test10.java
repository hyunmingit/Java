package test3;


interface Buyer{
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller {
	public void buy() {
		System.out.println("buy");
	}
	public void sell() {
		System.out.println("sell");
	}
}








public class Test10 {
	public static void main(String[] args) {
		
		Buyer buyer = new Customers();
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}

}
