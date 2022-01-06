package ch05;

public class Calc {
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	public static int plus(int x, int y) {
		return x+y; 
	}
	public static int minus(int x, int y) {
		return x-y; 
	}
	public static int multi(int x, int y) {
		return x *y; 
	}
	public static int div(int x, int y) {
		return x/y; 
	}

	
	
	
}
