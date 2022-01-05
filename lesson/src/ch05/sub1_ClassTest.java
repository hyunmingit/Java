package ch05;
/*
 * 날짜 2022.01.05
 * 이름 장현민
 * 내용 자바 클래스 실습 p140
 */
public class sub1_ClassTest {
	public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////////		
		
		//car 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);
		
		//객체 초기화
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		//bmw 객체 생성
		Car bmw = new Car("520d", "남색", 0);
		
		//초기화
		//bmw.name = "520d";
		//bmw.color = "남색";
		//bmw.speed = 0;
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		//account 생성
		Account kb = new Account("국민은행", "1-12-12345", "김유신", 10000);
		kb.balance--;
		//kb.bank = "국민은행";
		//kb.id = "1-12-12345";
		//kb.name = "김유신";
		//kb.balance = 10000;
		
		
		kb.deposit(40000);
		kb.withdraw(5000);
		//kb.balance--; //참조 변수로 객체의 변수를 직접 참조 :취약점
		kb.show();
		
		
		Account wr = new Account("우리은행", "2-12-12345", "김춘추", 30000);
		//wr.bank = "우리은행";
		//wr.id = "2-12-12345";
		//wr.name = "김춘추";
		//wr.balance =30000;
		
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
		
		
		
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////		
	}

}
