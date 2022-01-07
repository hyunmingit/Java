package ch08_209to214;

public class Computer {
	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process();
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
		
		
		gc = new Amd();
		
	}

}
