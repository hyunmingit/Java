package ch02;

/*
 * 날짜 : 2022/01/03
 * 이름 : 장현민
 *
 */

public class sub3_operator {
	public static void main(String[] args) {
		//산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3;
		int rs4 = num4 / num3;
		int rs5 = num4 % num3;
	System.out.println("rs1 :" +rs1);
	System.out.println("rs2 :" +rs2);
	System.out.println("rs3 :" +rs3);
	System.out.println("rs4 :" +rs4);
	System.out.println("rs5 :" +rs5);
	
		//증강,감소연산자
	int num = 0;
	num++; //+2
	++num;
	System.out.println("num:"+num);
	num--; //-2
	--num;
	System.out.println("num:" +num);
	
	 //복합대입연산자
	    int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
	    
	    n1 += 1; //n1 + 1 = result
	    n2 -= 2;
	    n3 *= 3;
	    n4 /= 4;
	    n1 += n4;
	     System.out.println("n1:" +n1);
	     System.out.println("n2:" +n2);
	     System.out.println("n3:" +n3);
	     System.out.println("n4:" +n4);
	     System.out.println("n1:" +n1);
	     
	
	    //비교연산자
	     int var1 = 1;
	     int var2 = 2;
	     
	     boolean r1 = var1 > var2; 
	     boolean r2 = var1 < var2; 
	     boolean r3 = var1 >= var2; 
	     boolean r4 = var1 <= var2; 
	     boolean r5 = var1 == var2; //서로같다
	     boolean r6 = var1 != var2; //다르다

	    System.out.println("r1:" +r1);
	    System.out.println("r2:" +r2);
	    System.out.println("r3:" +r3);
	    System.out.println("r4:" +r4);
	    System.out.println("r5:" +r5);
	    System.out.println("r6:" +r6);
	    
	    //논리연산자
	int var3 = 3;
	int var4 = 4;
	
	boolean res1  = var3 > 2 && var3 > 3; //var3이 2보다 크고 var3이 3보다큼
	boolean res2  = var3 > 2 && var4 > 4;
	
	boolean res3  = var3 > 2 || var4 > 4; //or
	boolean res4  = var3 > 4 || var4 > 5;
	boolean res5  = !(var3 > var4) ; //var3이 var4보다 크지않다
	boolean res6  = var3 <= var4; 
	
	System.out.println("res1:" +res1);
	System.out.println("res2:" +res2);
	System.out.println("res3:" +res3);
	System.out.println("res4:" +res4);
	System.out.println("res5:" +res5);
	System.out.println("res6:" +res6);
	
	
		
	}

}
