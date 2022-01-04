package ch03;



/*
 * 날짜 : 2022/01/03
 * 이름 : 장현민
 * 내용 : 자바 반복문 실습 p90
 */
public class sub2_ForTest {public static void main(String[] args) {
	
	//for
	for(int i=1 ; i<=5 ; i++) {
		System.out.printf("%d번 반복...\n", i);
		
	}
	//1부터 10까지 합
	int sum = 0;
	
	for (int k=1 ; k<=10 ; k++) {
		sum += k;
		
	}
	System.out.println("1부터 10까지 합 : " + sum);
	//1부터 10까지 짝수의 합
	int tot = 0;
	for (int k=1; k<=5 ; k++) {
		tot += 2 * k;
	}
	System.out.println("짝수의 합 " + tot);
	
	int odd = 0;
	for (int k=1; k<=10; k++) {
		if (k%2 == 0)
				{odd += k;}
	}
	System.out.println("짝수의 합" +odd);
	
	
		
			
	//중첩 for
	for(int a=1 ; a<=3 ; a++) {
		System.out.println("a :" +a);
		for(int b=1 ; b<=4 ; b++) {
			System.out.println("b:" +b);
		}for(int c=1 ; c<=5 ; c++) {
			System.out.println("c:" +c);}
	}
	//구구단
	for(int x=2 ; x<=9; x++) {
		System.out.println(x+ "단");
		for(int y=1; y<=9; y++) {
			int z = x * y;
					System.out.printf("%d x %d = %d\n", x, y, z);
		}
	}
	//별삼각형
	for(int start=10 ; start>=1 ; start--) {
		for(int end=1 ; end<=start; end++) {
			System.out.print("☆");
		}
		System.out.println();
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	for(int l=11 ; l<=19; l++) {
		System.out.println(l+ "단");
		for(int m=11; m<=19; m++) {
			int n = l * m;
					System.out.printf("%d x %d = %d\n", l, m, n);
		}
	}


///////////////////////////////////////////////////////////////////////////


	int sum1 = 0;
	int k = 1;
	while (k<=10) {
		sum1 +=k;
		k++;
	}
	System.out.println(+sum1);
	
	////////////////////////////////////////////////////////////////////////
	
	int total = 0;
	int i = 1;
	do { 
		total += i;
		i++;
		
	} while( i % 2 == 0 && i <= 10 );
	
	System.out.println("짝수의 합 :" +total);
		
	///////////////////////////////////////////////////////////
	int num = 1;
	
	while(true) {
		if(num % 5 == 0 && num % 7 == 0) {
			break;
		}
		num++;
	}
	System.out.println("5,7최소공배수 :" +num);

	//////////////////////////////////////////////////////////
	int tot1 = 0;
	int j = 0;
	while( j <= 10 ) {
		j++;
		if(j % 2 == 1) {
		 continue;
	}
		tot1 +=j;
	}
	System.out.println("짝수의 합: " +tot1);
	////////////////////////////////////////////////////

	int three = 0;
	int t = 0;
	
	
}

}


	
	
	



