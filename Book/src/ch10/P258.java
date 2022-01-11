package ch10;

public class P258 {
	public static void main(String[] args) {
		P257 a = new P257();
		
		P257.B b = new P257.B();
		b.var1 =3;
		b.method1();
		P257.B.var2 = 3;
		P257.B.method2();
		
		//인스턴스 내부 클래스 객체 생성
		P257.C c = a.new C();
		c.var1 = 3;
		c.method1();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
		
		
	}

}
