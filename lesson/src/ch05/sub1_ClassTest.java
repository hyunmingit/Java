package ch05;
/*
 * ��¥ 2022.01.05
 * �̸� ������
 * ���� �ڹ� Ŭ���� �ǽ� p140
 */
public class sub1_ClassTest {
	public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////////		
		
		//car ��ü ����
		Car sonata = new Car("�ҳ�Ÿ", "���", 0);
		
		//��ü �ʱ�ȭ
		//sonata.name = "�ҳ�Ÿ";
		//sonata.color = "���";
		//sonata.speed = 0;
		
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		//bmw ��ü ����
		Car bmw = new Car("520d", "����", 0);
		
		//�ʱ�ȭ
		//bmw.name = "520d";
		//bmw.color = "����";
		//bmw.speed = 0;
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		//account ����
		Account kb = new Account("��������", "1-12-12345", "������", 10000);
		kb.balance--;
		//kb.bank = "��������";
		//kb.id = "1-12-12345";
		//kb.name = "������";
		//kb.balance = 10000;
		
		
		kb.deposit(40000);
		kb.withdraw(5000);
		//kb.balance--; //���� ������ ��ü�� ������ ���� ���� :�����
		kb.show();
		
		
		Account wr = new Account("�츮����", "2-12-12345", "������", 30000);
		//wr.bank = "�츮����";
		//wr.id = "2-12-12345";
		//wr.name = "������";
		//wr.balance =30000;
		
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
		
		
		
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////		
	}

}
