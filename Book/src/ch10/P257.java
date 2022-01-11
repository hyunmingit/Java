package ch10;

class P257 {//바깥 클래스
	P257() {//바깥 클래스의 생성자
		System.out.println("A객체 생성");
	}
	
	static class B {//static 내부 클래스
		B() {//static 내부 클래스의 생성자
			System.out.println("C객체 생성");
		}
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
		static void method2() {
			System.out.println("static 내부 클래스의 method2()");
		}
	}
   
	
	public class C{//인스턴스 내부 클래스
		C() {//인스턴스 내부 클래스의 생성자
			System.out.println("B 객체 생성");
		}
		
		int var1;
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
	}
	void method() {//바깥 클래스의 메서드
		
		class D {//로컬 내부 클래스
			D(){
				System.out.println("D객체 생성");
		}
		int var1;
		
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
	}
		D d = new D();
		d.var1 =3;
		d.method1();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
