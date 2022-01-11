package ch10;

public class P255 {//바깥 클래스
	int i=10;
	void outerMethod() {
		class Inner {// 로컬 클래스
			int x=20;//메서드 지역 변수
			int i=30;//메서드 지역 변수
			void innerMethod(){
			System.out.println(x);
			System.out.println(i);//안쪽 클래스
			System.out.println(this.i);//안쪽 클래스
			System.out.println(P255.this.i);//바깥 클래스
			}
			
			
		}
		Inner inn = new Inner();
		inn.innerMethod();
		
		
		
	}
	
	public static void main(String[] args) {
		P255 lic = new P255();
		lic.outerMethod();
		
		
	}

}
