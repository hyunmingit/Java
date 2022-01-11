package ch09;
/*
 * 날짜 2022.01.10
 * 이름 장현민
 * 내용 자바 wrapper 내장클래스 실습 p284
 */
public class Sub03_Wrapper {
	public static void main(String[] args) {
		
		//기본타입 변수(primitive type)
		int var1 = 1;
		double var2 = 2;
		boolean var3 = true;
		
		//Wrapper 클래스로 포장(Auto-Boxing)
		Integer w1 = var1;
		Double w2 = var2;
		Boolean w3 = var3;
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		//문자열 >> 기본타입 변환
		String str1 = "1";
		String str2 = "2.3";
		String str3 = "false";
		
		int rs1 = Integer.parseInt(str1);
		double  rs2 = Double.parseDouble(str2);
		boolean rs3 = Boolean.parseBoolean(str3);
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		
		//문자열 >> Wrapper 변환
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println(wr1);
		System.out.println(wr2);
		System.out.println(wr3);
		
		//Wrapper >> 문자열 변환
		String s1 = wr1.toString();
		String s2 = wr2.toString();
		String s3 = wr3.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Wrapper >> 기본타입 변환(Auto-Unboxing)
		
		int v1 = wr1;
		double v2 = wr2;
		boolean v3 = wr3;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		
		
		
		
	}

}
