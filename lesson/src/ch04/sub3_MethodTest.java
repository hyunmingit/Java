package ch04;
/*
 * 날짜 : 2022/01/04
 * 이름 : 장현민
 * 내용 : 자바 함수(Method) 실습하기 p152
 * Method
 *   -프로그래밍에서 함수를 자바에서 Method
 *   -일련의 코드로직을 모듈화한 구조체
 *   -함수는 정의(define)하고 호출(call)
 */
public class sub3_MethodTest {
	public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//함수호출
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("f(1) : " +r1);
		System.out.println("f(2) : " +r2);
		System.out.println("f(3) : " +r3);
		
		
		int s1=sum(1,10);
		System.out.println("1에서 10까지 합 : " +s1);
		int s2=sum(1,100);
		System.out.println("1에서 100까지 합 : " +s2);
		int s3=sum(1,1000);
		System.out.println("1에서 1000까지 합 : " +s3);
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////		
	}/// main method end
	
	//함수정의
	public static int f(int x) {
		int y = 2*x+3;
		return y;
		
	}
	public static int sum(int start, int end) {
		int total = 0;
		for(int k=start ; k<=end ; k++) {
			total +=k;
			
		}
		return total;
		
		
	}

}
