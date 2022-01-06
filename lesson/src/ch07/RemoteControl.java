package ch07;


public interface RemoteControl {
	
	//추상 메서드
	public void poweron (); //public 뒤에 abstract 생략
 	public void poweroff ();

 	public void chup ();
	public void chdown ();

	public void soundup ();
	public void sounddown ();

}
