package ch04;
/*
 * ��¥ : 2022/01/04
 * �̸� : ������
 * ���� : �ڹ� �Լ�(Method) �ǽ��ϱ� p152
 * Method
 *   -���α׷��ֿ��� �Լ��� �ڹٿ��� Method
 *   -�Ϸ��� �ڵ������ ���ȭ�� ����ü
 *   -�Լ��� ����(define)�ϰ� ȣ��(call)
 */
public class sub3_MethodTest {
	public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//�Լ�ȣ��
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("f(1) : " +r1);
		System.out.println("f(2) : " +r2);
		System.out.println("f(3) : " +r3);
		
		
		int s1=sum(1,10);
		System.out.println("1���� 10���� �� : " +s1);
		int s2=sum(1,100);
		System.out.println("1���� 100���� �� : " +s2);
		int s3=sum(1,1000);
		System.out.println("1���� 1000���� �� : " +s3);
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////		
	}/// main method end
	
	//�Լ�����
	public static int f(int x) {
		int y = 2*x+3;
		return y;
		
	}
	public static int sum(int start, int end) {
		int total = 0;
		for(int k=start ; k<=end ; k++) {
			total +=k;
			
		}
		return total;
		
		
	}

}
