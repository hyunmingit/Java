package ch10;

import ch09.Apple;
import ch09.Banana;



public class SUb01_Genetic {
	public static void main(String[] args) {
		
		
		Apple apple = new Apple("국내산", 3000);
		Banana banana = new Banana("필리핀산", 2000);
		
		FruitBox<Apple> box1= new FruitBox<>();
		FruitBox<Banana> box2= new FruitBox<>();
		
		
		box1.setFruit(apple);
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
		
		
		
		
		
		
		
		
		
	}

}
