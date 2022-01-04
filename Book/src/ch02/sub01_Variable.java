package ch02;
/*
 *날짜 : 2021/12/31
 *내용 : 36p
 *
 */

public class sub01_Variable {
	public static void main(String[] args) {
		char a = 'A';   //문자로 출력
		System.out.println("a: "+a);
		
		int num1 = a;  //A:65 a:97 로 치환됨 숫자로 출력
		System.out.println("num1 :"+num1);
		
		char c = 66;
		System.out.println("c:" +c);

		int d = a+num1;
		System.out.println("d:" +d);
		
		////////////////////////////////
		
		
		float var1 = 1.12345678f;
		double var2 = 1.123456789012345678;
		
		System.out.println("var1 : " +var1);
		System.out.println("var2:"+var2);
		
		
		String str1 = "홍길동";
		String str2 = "null";
		String str3 = "   ";
		
		System.out.println("str1:" +str1);
		System.out.println("str2:" +str2);
		System.out.println("str3:" +str3);
		
		
		
		
				
				
				
	}

}


