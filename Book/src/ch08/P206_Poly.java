package ch08;

public class P206_Poly {
	public static void main(String[] args) {
		
		P206_Child c = new P206_Child();
		
		c.run();
		
		P206_Parent p = new P206_Parent();
		p.run();
		
		
		P206_Parent f = new P206_Child();
		f.run();
		
		P206_Child s = (P206_Child) f;
		s.eat();
		
		
		
		
	}

}
