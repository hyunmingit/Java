package ch07;
/*
 * ��¥ 2022.01.06
 * �̸� ������
 * ���� �ڹ� �������̽� �ǽ� p228
 * 
 */

public class Sub1_InterfaceTest {
	public static void main(String[] args) {
		
		
		
		
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchon();
		socket.switchoff();
		
	}

}
