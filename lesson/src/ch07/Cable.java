package ch07;

public abstract class Cable implements Socket {
	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	public void switchon() {
		bulb.lighton();
	}
	public void switchoff() {
		bulb.lightoff();
	}

}
