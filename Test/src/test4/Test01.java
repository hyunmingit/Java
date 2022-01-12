package test4;

import java.io.Closeable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*10)+1;
		int input =0;
		int count =0;
		
		do {
			count++;
			System.out.println("-------------------");
			System.out.println("Guess number.");
			System.out.print("1~10 : ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input <0) {
					throw new Exception("음수는 입력할 수 없음");
				}
			}catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			if(answer>input) {
				System.out.println("up");
			}else if(answer < input) {
				System.out.println("down");
			}else {
				System.out.println("answer : " +answer);
				System.out.println("Correct!");
				System.out.println("You tried "+count+" times");
             break;
			}
			
		}while(true);
		System.out.println("Program off");
		
		
		
	}

}
