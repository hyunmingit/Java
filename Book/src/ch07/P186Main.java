package ch07;

public class P186Main {
	public static void main(String[] args) {
		
		//P186 s = new P186(); private 때문에 에러
		
		P186 s1 = P186.getInstance();
		P186 s2 = P186.getInstance();
		P186 s3 = P186.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//dd
	}

}
