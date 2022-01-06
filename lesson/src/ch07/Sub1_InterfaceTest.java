package ch07;
/*
 * 날짜 2022.01.06
 * 이름 장현민
 * 내용 자바 인터페이스 실습 p228
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
