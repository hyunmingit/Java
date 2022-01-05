package ch07;

public class P176 {
	
	//static 변수
	static int sVar;
	//static 메서드
	static void sMethod() {
		
	}
	
	//인스턴스 변수
	int var;
	
	//인스턴스 메서드
	void method() {
		
	}
	//static 초기화 블럭
	static {
		sVar =0 ; //static 변수
		sMethod ();//static메서드
		
		//에러 (인스턴스 변수, 메서드 사용 불가		
		//var = 0; //인스턴스 변수
		//method();//인스턴스 메서드
	}
	//static메서드
	static void sMethod2() {
		//에러 (static메서드에서 this 키워드 사용 불가
		//this.sVar = 0; //static변수
		//this.sMethod();//static메서드
	}

}
