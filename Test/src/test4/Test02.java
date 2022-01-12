package test4;

import java.util.Scanner;

class NotFoundException extends Exception{
	public NotFoundException() {
		super("Missing Number");
	}
}



public class Test02 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Find Number : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find,arr);
			System.out.println("Number Found");
			
		}catch (NotFoundException e) {
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		System.out.println("Program off...");		
				
	}

public static void searchArray(int find, int[] arr) throws NotFoundException{
		for(int i : arr) {
			if(i==find) {
				return;
			}
		}
		throw new NotFoundException();
	}

	
}