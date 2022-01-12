package test1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.println("올해 년도 입력 : ");
		year = sc.nextInt();
		
		System.out.println("태어난 년도 : ");
		birth = sc.nextInt();
		
		System.out.println("이름 : ");
		name= sc.next();
		
		System.out.printf("%s 님 당신은 %d");
		
	}

}
