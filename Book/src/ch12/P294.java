package ch12;

public class P294 {
	public static void main(String[] args) {
		//�ڹٹ���
		System.out.println(System.getProperty("java.version"));
		//jdk ���
		System.out.println(System.getProperty("java.home"));
		//os
		System.out.println(System.getProperty("os.name"));
		//���� ������
		System.out.println(System.getProperty("file.separator"));
		//����ڸ�
		System.out.println(System.getProperty("user.name"));
		//����� Ȩ���丮
		System.out.println(System.getProperty("user.home"));
		//���� ��ũ�����̽� ���丮 ��ġ
		System.out.println(System.getProperty("user.dir"));
		
		
		System.out.println();
		for(String var : System.getenv().keySet()) {
			System.out.println(var+"="+System.getenv(var));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
