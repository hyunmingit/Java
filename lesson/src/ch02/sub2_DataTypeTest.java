package ch02;

/*
 * 날짜 : 2021/12/31
 * 이름 : 장현민
 * 내용 : 자바 자료형(Data Type) 실습하기 교재 p38
 *
 */

public class sub2_DataTypeTest {
	public static void main(String[] args) {
		
		//정수형
		byte num1 = 127;
		 //128미만 숫자만 잘 안씀
		short num2 = 32767;
		 //
		int num3 = 2147483647;
		 //제일 많이 씀
		long num4 = 1000L;
		 //접미사 L이 붙어야 해서 잘 안씀
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		//실수형
		float ggg = 1.123456789f;
		  //소수점 아래 7자리까지
		double var2 = 1.1234567890123456789;
		  //많이 씀 16자리까지 
		
		System.out.println("ggg : "+ggg);
		System.out.println("var2 : "+var2);
				
		
		//논리형
		boolean val1 = true;
		boolean val2 = false;
		
		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
		

		//문자형 - 글자 하나만 저장 단어는 안됨 잘 안씀
		char ch1 = 'A';
		char ch2 = '가';
				System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);

		//문자열	단어 저장
		String str1 = "a";
		String str2 = "apple";
		String str3 = "사";
		String str4 = "사과";
		String str5 = "123";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println("str5 : "+str5);
		
		
	}
	
}
