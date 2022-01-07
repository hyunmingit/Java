package ch07;

public class P192_1 {
	public static void main(String[] args) {
		
	int[] arr = {9, 5, 24, 13, 3, 21};
	
	Math m = new Math();
	int max = m.max(arr);
	int min = m.min(arr);
	System.out.println(max);
	System.out.println(min);
	
	
	
	
		
		
		
		
		
		
		
	}

}

class Math {
	public int max(int[] arr) {
		int temp = arr[0];
		for (int i = 0 ; i < arr.length ; i++ ) {
			if (arr[i] > temp) {
				temp =arr[i] ;
			}
			
		}
		return temp;
	}
	public int min(int[] arr) {
		int temp = arr[0];
		for (int i = 0 ; i < arr.length ; i++ ) {
			if (arr[i] < temp) {
				arr[i] = temp;
			}
		} return temp;
	}
}



