package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test09 {
	public static void main(String[] args) {
		
		
		List<Apple> list1 = new ArrayList<>();
		list1.add(new Apple("����", 3000));
		list1.add(new Apple("��õ", 3000));
		list1.add(new Apple("����", 3000));
		
		
		List<Apple> list2 = new ArrayList<>();
		list2.add(new Apple("û��", 3000));
		list2.add(new Apple("����", 3000));
		list2.add(new Apple("�ܾ�", 3000));
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("�о�", 3000));
		list3.add(new Apple("�Ծ�", 3000));
		list3.add(new Apple("��õ", 3000));
		
		
		Map<String, List<Apple>> map = new HashMap<>();
		map.put("���", list1);
		map.put("���", list2);
		map.put("�泲", list3);
		
		List<Apple> list = map.get("���");
		Apple apple = list.get(2);
		apple.show();
		
		map.get("���").get(1).show();
		
		map.get("�泲").get(0).show();
		
		
		
		
		
		
	}

}
