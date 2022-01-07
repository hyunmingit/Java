package ch07;
/*
 * 날짜 2022.01.06
 * 이름 장현민
 * 내용 자바 인터페이스 실습 p228
 * 
 */

public class Sub1_InterfaceTest {
	public static void main(String[] args) {
		
		LgRemote lg = new LgRemote();
		SamsungRemote sm = new SamsungRemote();
		
		lg.poweron();
		lg.chdown();
		lg.sounddown();
		lg.poweroff();
				
		sm.poweron();
		sm.chup();
		sm.sounddown();
		sm.poweroff();
		
		
		
		
		
		
		
		Bulb bulb = new Bulb();
		Socket socket = new Socket() {
			
			@Override
			public void switchon() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void switchoff() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		socket.switchon();
		socket.switchoff();
		
	}

}
