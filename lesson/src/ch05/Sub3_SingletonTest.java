package ch05;
/*
 * ��¥ 2022.01.06
 * �̸� ������
 * ���� �ڹ� �̱��� ��ü �ǽ� 
 * 
 */

public class Sub3_SingletonTest {
	public static void main(String[] args) {
		Calc c = Calc.getInstance();
		
		int r1 = Calc.plus(1, 2);
		int r2 = Calc.minus(1, 2);
		int r3 = Calc.multi(3, 8);
		int r4 = Calc.div(64, 4);
		
		System.out.println("r1 : " +r1);
		System.out.println("r2 : " +r2);
		System.out.println("r3 : " +r3);
		System.out.println("r4 : " +r4);
		
		
		
		
		
		
	}

}
