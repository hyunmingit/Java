package ch07;

public class P144main {
	public static void main(String[] args) {
		
		P144 martiz = new P144();
		P144 carnival = new P144()
;
		martiz.color = "white";
		martiz.company = "daewoo";
		martiz.type = "small";
		
		carnival.color = "black";
		carnival.company = "kia";
		carnival.type = "large";
		
		martiz.go();
		carnival.go();
		
		System.out.println(martiz.color);
		System.out.println(martiz.company);
		System.out.println(martiz.type);
		System.out.println(carnival.color);
		System.out.println(carnival.company);
		System.out.println(carnival.type);
		
		
	}

}
