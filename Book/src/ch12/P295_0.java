package ch12;

public class P295_0 {
	public static void main(String[] args) {
		
		for (String var : System.getenv().keySet()){ 
			System.out.println(var + "=" + System.getenv(var));
		}
		
		
	}

}
