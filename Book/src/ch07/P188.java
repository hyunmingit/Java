package ch07;

public class P188 {
	

	public static void main(String[] args) {
		

		Final f = new Final();
		//f.number = 100; ¿¡·¯
		System.out.println(f);
		
	
				
				
				
				
	}

}


class Final {
	 final int number;
	
	Final(){
		number = 100;
		System.out.println(number);
	}
}