package ch07;

public class P148 {
	public static void main(String[] args) {
		
		//Ŭ���� ���� ���
		System.out.println("Avante ������ : "+Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		//�ν��Ͻ� ������ �� ����
		a1.color = "white";
		a2.color = "black";
		
		//�ν��Ͻ� ���� ���
		System.out.println("a1 color : "+a1.color);
		System.out.println("a2 color : "+a2.color);
		
		//Ŭ���� ������ �ν��Ͻ� ��ü�� ���
		System.out.println("a1 ������ : " +a1.company);
		System.out.println("a2 ������ : " +a2.company);
		
		//Ŭ���� ������ �� ����
		a1.company = "kia";
		
		//Ŭ���� ������ �� ���� �� Ŭ���������� �ν��Ͻ����� ���
		System.out.println("Avante company : " +Avante.company);
		System.out.println("a1 company : " +a1.company);
		System.out.println("a2 company : " +a2.company);
		
		
		
		
	}

}
class Avante {
	String color;
	static String company = "Hyundai";
	
}
