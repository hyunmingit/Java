package ch11;

public class P270 {
	public static void main(String[] args) {
		
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
			System.out.println(3/0);
		}catch (ArithmeticException e) {
			System.out.println("can not divide by 0");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of index range");
		}catch (Exception e) {
			System.out.println("Exception Occurrence");
		}
		
		
		
	}

}
