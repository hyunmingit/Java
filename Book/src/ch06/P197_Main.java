package ch06;

public class P197_Main {
	public static void main(String[] args) {
		
		P197_Phone p = new P197_Phone();
		p.name = "효도폰";
		p.company = "LG";
		p.color = "white";
		System.out.println("Phone 출력");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.contact();
		p.reponse();
		
		P197_SmartPhone sp = new P197_SmartPhone();
		sp.name = "iphone";
		sp.company = "Apple";
		sp.color = "black";
		
		System.out.println("Smart Phone 출력");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.contact();
		sp.reponse();
		sp.install();
		
		 //ㅇㅇ
		
	}

}
