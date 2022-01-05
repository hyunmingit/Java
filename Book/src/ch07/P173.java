package ch07;

public class P173 {
	
	//ÇÊµå
	String color;
	String company;
	String type;
	
	P173() {
		this("white", "kia", "small");
		
	}

	P173(String color, String company, String type) {
		this.color = color;
		this.company = company;
		this.type = type;
	}
	P173(String com, String t){
		this("white", com, t);
	}
	P173(String t) {
		this("white", "kia", t);
		
	}
	public String toString() {
		return color + "-" + company + "-" + type;
	}
	
	

}
