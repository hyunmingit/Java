package ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch09.Apple;

public class Sub04_Map {public static void main(String[] args) {
	
	//map 생성
	Map<String, String> map1 = new HashMap<>();
	map1.put("A", "Apple");
	map1.put("B", "Banana");
	map1.put("C", "Cherry");
    
	System.out.println("map1 : " +map1);
	
	//map size
	System.out.println("map size : " +map1.size());
	
	//map print
	System.out.println("map1 A : " +map1.get("A"));
	System.out.println("map1 B : " +map1.get("B"));
	System.out.println("map1 C : " +map1.get("C"));
	
	//map 응용
	List<Map<Integer, Apple>> mapList = new ArrayList<>();
	
	Map<Integer, Apple> m1 = new HashMap<>();
	m1.put(101, new Apple("한국", 3000));
	m1.put(102, new Apple("중국", 2000));
	m1.put(103, new Apple("일본", 1000));
	
	Map<Integer, Apple> m2 = new HashMap<>();
	m2.put(201, new Apple("미국", 3000));
	m2.put(202, new Apple("영국", 2000));
	m2.put(203, new Apple("호주", 1000));
	
	
	Map<Integer, Apple> m3 = new HashMap<>();
	m3.put(301, new Apple("태국", 3000));
	m3.put(302, new Apple("대만", 2000));
	m3.put(303, new Apple("홍콩", 1000));
	
	mapList.add(m1);
	mapList.add(m2);
	mapList.add(m3);
	
	
	//한국사과 출력
	Map<Integer, Apple> appleMap = mapList.get(0);
	Apple apple = appleMap.get(101);
	apple.toString();
	
	//호주(Method Chaining)
	mapList.get(1).get(203).toString();
	
	//대만사과
	mapList.get(2).get(302).toString();
	
	
	
}
}
