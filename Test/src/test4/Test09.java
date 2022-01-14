package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test09 {
	public static void main(String[] args) {
		
		
		List<Apple> list1 = new ArrayList<>();
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("이천", 3000));
		list1.add(new Apple("수원", 3000));
		
		
		List<Apple> list2 = new ArrayList<>();
		list2.add(new Apple("청주", 3000));
		list2.add(new Apple("충주", 3000));
		list2.add(new Apple("단양", 3000));
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("밀양", 3000));
		list3.add(new Apple("함안", 3000));
		list3.add(new Apple("합천", 3000));
		
		
		Map<String, List<Apple>> map = new HashMap<>();
		map.put("경기", list1);
		map.put("충북", list2);
		map.put("경남", list3);
		
		List<Apple> list = map.get("경기");
		Apple apple = list.get(2);
		apple.show();
		
		map.get("충북").get(1).show();
		
		map.get("경남").get(0).show();
		
		
		
		
		
		
	}

}
