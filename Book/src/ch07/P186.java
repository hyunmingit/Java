package ch07;

public class P186 {
	
	//static ����
	private static P186 instance = new P186();
	
	//�����ڿ� private ���� ������
	private P186() {
		System.out.println("��ü ����");
	}
	//static �޼���
	public static P186 getInstance() {
		System.out.println("��ü ����");
		return instance;
	}

}
