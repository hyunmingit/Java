package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
 * 날짜 2022.01.12
 * 이름 장현민
 * 내용 자바 파일 입출력 실습 p496
 * 
 */

public class Sub02_Properties {
public static void main(String[] args) {
	
	
	//Map<String, String> map = new HashMap<>();
	
	//프로퍼티(Properties): key, value가 문자열인 데이터구조체
	Properties prop = new Properties();
	prop.setProperty("A", "Apple");
	prop.setProperty("B", "Banana");
	prop.setProperty("C", "Cherry");
	
	System.out.println("prop : " + prop);
	
	String path = "C:\\Users\\bigdata\\Desktop\\Fruit.properties";
	
	try {
		//프로퍼티 객체 저장
		FileOutputStream fos = new FileOutputStream(path);
		prop.store(fos, null);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	 System.out.println("프로퍼티 객체 저장완료...");
	
	
	
	
	try {
		//파일 읽기(불러오기)
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop2 = new Properties();
		prop2.load(fis);
		
		System.out.println("prop2 : "+prop2);
		System.out.println("A : "+prop2.getProperty("A"));
		System.out.println("B : "+prop2.getProperty("B"));
		System.out.println("C : "+prop2.getProperty("C"));
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	
}
}
