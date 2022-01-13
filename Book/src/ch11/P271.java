package ch11;

public class P271 {
	public static void main(String[] args) {
		
		System.out.println("DB connecting");
		try {
			System.out.println("DB Operation");
			//System.out.println(3/0);
		}catch (Exception e) {
			System.out.println("Exception Occured while DB Operating");
		}finally {
			System.out.println("DB disconnecting");
		}
		
		
		
	}

}
