package ch11;

public class P273 {
	public static void main(String[] args) {
		System.out.println("Program Operating...");
		try {
			throw new Exception("Exception Occured");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Off..");
		
		
		
		
		
	}

}
