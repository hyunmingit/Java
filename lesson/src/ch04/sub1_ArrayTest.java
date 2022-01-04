package ch04;
/*
 * 날짜 : 2022/01/04
 * 이름 : 장현민
 * 내용 : 자바 배열 실습하기 p108
 * 
 * 배열(Array)
 *  -데이터를 일렬로 나열해서 저장하는 자료구조
 *  -파이썬 List 자료구조와 비슷함
 *  
 */



public class sub1_ArrayTest {public static void main(String[] args) {
	
	//배열(Array)
	int nums[] = {1, 2, 3, 4, 5};
	String cities [] = {"서울", "대전", "대구", "부산", "광주"};
	char []letters = {'a', 'b', 'c' };
	
	
	//배열 길이
	System.out.println("배열 nums의 길이 :" +nums.length);
	System.out.println("배열 cities의 길이 :" +cities.length);
	System.out.println("배열 letters의 길이 :" +letters.length);
	
	
	//배열 원소 출력
	System.out.println("nums[0] :" +nums[0]);
	System.out.println("nums[0] :" +nums[2]);
	System.out.println("nums[0] :" +nums[(int) (0.5)]);
	System.out.println("cities[3] :" +cities[3]);
	System.out.println("cities[4] :" +cities[4]);
	System.out.println("letters[1] :" +letters[1]);
	
	//배열 반복문
	for(int num : nums) {
		System.out.println("num : "+num);
	}
	for(String city : cities) {
		System.out.println("city : "+city);
	}

	for(int i=0; i<cities.length ; i++) {
		System.out.println("city :" +cities[i]);
	}
		
	
	
	
	
	////////////////////////////////////////////
}

}
