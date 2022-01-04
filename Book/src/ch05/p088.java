package ch05;

import java.util.Scanner;

/*
 * 2022.01.04.
 * 장현민
 * p88
 */

public class p088 {
	public static void main(String[] args) {
		
		System.out.println("점수 입력");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String grade = "";
		switch (score / 10) {
			case 9 :
				grade = "A";
				break;
			case 8 :
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			default :
				grade = "F";
				break;
			
		}
		System.out.println("학점 : " +grade);
		
		
		
		
		
	
		
		
		
		
	}

}
