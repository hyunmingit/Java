package ch05;

import javax.xml.stream.events.EndDocument;

/*
 * 2022.01.04.
 * 장현민
 * p95
 */
public class p095 {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println("i : " +i);
		}while (i<10);
			
		/////////do가 while보다 선행이라 1번은 무조건 실행
		
		
		
		
		//////구구단
		

		
		for(int x =2; x< 10; x++) {
			System.out.println("::"+x+"단::");
		
			for(int y =1 ; y< 10; y++) {
				int z = x*y;
				System.out.println(""+x+" x "+y+" =" +z);
			}
		}
		
		////////삼각별
		
		for(int s =1; s<=10; s++) {
			for ( int e = 1; e<=s; e++) 
			{System.out.print("★") ;
		}
			System.out.println();}
			
		
		
//////////////////////////////////////////////////////////////////////////		
	}

}
