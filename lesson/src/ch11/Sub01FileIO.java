package ch11;

import java.io.FileInputStream;

import java.io.FileOutputStream;


/*
 * 날짜 2022.01.12
 * 이름 장현민
 * 내용 자바 파일 입출력 실습 p496
 * 
 */

public class Sub01FileIO {
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata\\Desktop\\Test1.txt";
		String path2 = "C:\\Users\\bigdata\\Desktop\\Test2.txt";
 		
		try {
			
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			while (true ) {
				
				value = fis.read();
				if (value == -1) {
					break;
				}
				fos.write(value);
			}
			//스트림 연결 해제
			fis.close();
			fos.close();
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("Program Off...");
		
		
		
		
		
		
		
	}

}
