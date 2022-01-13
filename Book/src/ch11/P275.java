package ch11;


public class P275 {
	public static void main(String[] args) {
		
		try {
			first();
			
		}catch (Exception e) {
			System.out.println("main() Exception Operating");
			System.out.println(e.getMessage());
			
		}
		
		
		
		
	}
	static void first() throws Exception{
		try { second();
	}catch(Exception e) {
		System.out.println("first() Exception Operating");
		throw e;
	}
	}
	
	static void second() throws Exception {
		try {
			throw new Exception("Exception Occured");
		}catch (Exception e) {
			System.out.println("second() Exception operating");
			throw e;
		}
	}

}
