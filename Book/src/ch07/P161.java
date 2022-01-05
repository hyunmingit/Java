package ch07;

public class P161 {
	public static void main(String[] args) {
		
		System.out.println(divide(pow(add(15,36))));
		
		
		
		
		
	}
static int add(int x, int y) {
	return x + y;
	
}
static int pow(int x) {
	return x* x;
	
}
static int divide(int x) {
	return x /2 ;
}
}
