package ch07;

public class P145 {
	public static void main(String[] args) {
		
		//car 타입의 배열객체 생성
		P144[] cars = new P144[3];
		
		//car 객체 생성
		P144 martiz = new P144();
		
		martiz.color = "white";
		martiz.company = "daewoo";
		martiz.type = "small";
		
		//모든 인덱스에 martiz 저장
		
		for (int i = 0; i<cars.length; i++) {
			cars[i] = martiz;
		}
		System.out.println("2번 인덱스 color : " +cars[2].color);
		cars[0].color = "black";
		System.out.println("2번 인덱스 color : " +cars[2].color);
		
		
		
		
	}

}
