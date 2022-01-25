package ch12;

public class P298 {
	public static void main(String[] args) {
		
		String name1 = "John";
		String name2 = "John";
		
		if (name1 == name2) {
			System.out.println("1==2");
		} else {	
			System.out.println("1!=2");
		}
		
		if (name1.equals(name2)) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
		
		String name3 = new String ("John");
		String name4 = new String ("John");
		
		if (name3 == name4) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
		
		if (name3.equals(name4)) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
		
		
		
	}

}
