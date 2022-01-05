package ch07;

public class P146 {
	public static void main(String[] args) {
		
		//car 타입의 배열객체 생성
		
		P144[] cars = new P144[3];
		//모든 인덱스에 new 연산자로 객체 생성
		for (int i =0; i<cars.length; i++) {
			cars[i] = new P144();
			cars[i].color = "white";
			cars[i].company = "daewoo";
			cars[i].type = "small";
			
			
		}
		System.out.println("인덱스 0 color : " +cars[0].color);
		System.out.println("인덱스 1 color : " +cars[1].color);
		System.out.println("인덱스 2 color : " +cars[2].color);
		
		cars[0].color = "black";
		
		System.out.println("인덱스 0 color : " +cars[0].color);
		System.out.println("인덱스 1 color : " +cars[1].color);
		System.out.println("인덱스 2 color : " +cars[2].color);
		
		
	}

}
