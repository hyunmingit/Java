package ch02;

/*
 * ��¥ : 2021/12/31
 * �̸� : ������
 * ���� : �ڹ� �ڷ���(Data Type) �ǽ��ϱ� ���� p38
 *
 */

public class sub2_DataTypeTest {
	public static void main(String[] args) {
		
		//������
		byte num1 = 127;
		 //128�̸� ���ڸ� �� �Ⱦ�
		short num2 = 32767;
		 //
		int num3 = 2147483647;
		 //���� ���� ��
		long num4 = 1000L;
		 //���̻� L�� �پ�� �ؼ� �� �Ⱦ�
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		//�Ǽ���
		float ggg = 1.123456789f;
		  //�Ҽ��� �Ʒ� 7�ڸ�����
		double var2 = 1.1234567890123456789;
		  //���� �� 16�ڸ����� 
		
		System.out.println("ggg : "+ggg);
		System.out.println("var2 : "+var2);
				
		
		//����
		boolean val1 = true;
		boolean val2 = false;
		
		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
		

		//������ - ���� �ϳ��� ���� �ܾ�� �ȵ� �� �Ⱦ�
		char ch1 = 'A';
		char ch2 = '��';
				System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);

		//���ڿ�	�ܾ� ����
		String str1 = "a";
		String str2 = "apple";
		String str3 = "��";
		String str4 = "���";
		String str5 = "123";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println("str5 : "+str5);
		
		
	}
	
}
