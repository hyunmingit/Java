package ch10;

public class P259 {
	
	interface InterfaceEx{
		void method();
	}
	
	InterfaceEx ie;
	
	void serInterfaceEx(InterfaceEx ie) {
		this.ie = ie;
	}
	
	void outerMethod() {
		ie.method();
	}

}
