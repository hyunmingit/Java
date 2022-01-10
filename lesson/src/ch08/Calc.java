package ch08;

public class Calc {
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	public static int plus(int x, int y) {
		return x+y; 
	}
	public int minus(int x, int y) {
		return x-y; 
	}
	public int multi(int x, int y) {
		return x *y; 
	}
	public  int div(int x, int y) throws Exception{
		if (y<=0) {
			 Exception e1 = new Exception("0 또는 음수로는 나눌수 없습니다");
			 throw e1;
		}
		
		if(x==0) {
			 Exception e2 = new Exception("0 또는 음수로는 나눌수 없습니다");
			 throw e2;
		}
		
		
		int z = x/y;
		
		return z; 
	}

	
	
	
}
