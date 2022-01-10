package ch08;
/*
 * 날짜 2022.01.10
 * 이름 장현민
 * 내용 자바 예외처리 실습 p264
 */

public class Sub1_ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = num1 / num2;
		int r5 = num2 / num3;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		try {
		System.out.println(r5);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("종료");
		
		
		
		
		
		
		
	}

}
