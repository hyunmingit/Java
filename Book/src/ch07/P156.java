package ch07;

public class P156 {
	public static void main(String[] args) {
		
		Return2 obj = new Return2();
		
		obj.getTest(0);
		obj.getName(1);
		
		System.out.println(obj.getName(0));
		
		System.out.println(obj.getName(1));
		
		
		
		
		
		
	}

}


class Return2 {
	void getTest(int type) {
		System.out.println("getTest() method Start");
		
		if (type ==1) {
			return;
		}
		System.out.println("getTest() method End");
	}
	

    String getName(int type) {
	    if (type ==1) {
		    return "";
	}
	    return "john";
	
	}
}