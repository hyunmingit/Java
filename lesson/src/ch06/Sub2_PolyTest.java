package ch06;
/*
 * ��¥ 2022.01.05
 * �̸� ������
 * ���� �ڹ� ������ �ǽ��ϱ� P205
 * 
 * ������ (Polymorphism)
 * -�ϳ��� ����� ���� ������� ���ϴ� ����
 * -��� ���迡�� �θ� Ŭ������ ����� �ڽĿ��� �ٽ� ������
 *  ���� �޼��带 �ڽĿ��� �����ϸ� �θ𿡰Լ� ������ �޼��带 �ڽ��� ���(��üȭ ��)
 * -
 */
public class Sub2_PolyTest {
	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();				
	    Lion lion = new Lion();	 
	    Shark shark = new Shark();
	    
	    eagle.move();
		lion.move();
		shark.move();
		System.out.println("================");
		eagle.hunt();
		lion.hunt();
		shark.hunt();
		
		
		
		
		
		
		
	}

}
