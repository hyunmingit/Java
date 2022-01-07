package ch08;

public class P199 {
	public static void main(String[] args) {
		
		P197 p = new P197();
		p.name = "효도폰";
		p.company = "Lg";
		p.color = "white";
		
		System.out.println(":::효도폰:::");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.receive();
		
		System.out.println();
		
		P198 sp = new P198();
		sp.name = "Galaxy";
		sp.company = "Samsung";
		sp.color = "Black";
		
		System.out.println(":::Galaxy:::");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.receive();
		sp.installapp();
		
	
		
		
		
	}

}
