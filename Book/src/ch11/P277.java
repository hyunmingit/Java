package ch11;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

public class P277 {
	static String user_id = "seo";
	static String user_pw = "smg1234";
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("ID : ");
			String input_id = scan.nextLine();
			
			System.out.print("Password : ");
			String input_pw = scan.nextLine();
			scan.close();
			if(!user_id.equals(input_id)) {
				throw new LoginException("Wrong ID");
			} else if (!user_pw.equals(input_pw)) {
				throw new LoginException("Wrong PWD");
			}else {
				System.out.println("Log in Success");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}

}
