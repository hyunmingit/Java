package ch07;

public class P146 {
	public static void main(String[] args) {
		
		//car Ÿ���� �迭��ü ����
		
		P144[] cars = new P144[3];
		//��� �ε����� new �����ڷ� ��ü ����
		for (int i =0; i<cars.length; i++) {
			cars[i] = new P144();
			cars[i].color = "white";
			cars[i].company = "daewoo";
			cars[i].type = "small";
			
			
		}
		System.out.println("�ε��� 0 color : " +cars[0].color);
		System.out.println("�ε��� 1 color : " +cars[1].color);
		System.out.println("�ε��� 2 color : " +cars[2].color);
		
		cars[0].color = "black";
		
		System.out.println("�ε��� 0 color : " +cars[0].color);
		System.out.println("�ε��� 1 color : " +cars[1].color);
		System.out.println("�ε��� 2 color : " +cars[2].color);
		
		
	}

}
