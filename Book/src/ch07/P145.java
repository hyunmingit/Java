package ch07;

public class P145 {
	public static void main(String[] args) {
		
		//car Ÿ���� �迭��ü ����
		P144[] cars = new P144[3];
		
		//car ��ü ����
		P144 martiz = new P144();
		
		martiz.color = "white";
		martiz.company = "daewoo";
		martiz.type = "small";
		
		//��� �ε����� martiz ����
		
		for (int i = 0; i<cars.length; i++) {
			cars[i] = martiz;
		}
		System.out.println("2�� �ε��� color : " +cars[2].color);
		cars[0].color = "black";
		System.out.println("2�� �ε��� color : " +cars[2].color);
		
		
		
		
	}

}
