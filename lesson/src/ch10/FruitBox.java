package ch10;

public class FruitBox<T>{
	
	private T fruit;
	
    
	//getter : ��� ������ �ܺο� �����ϴ� �޼���
	public T getFruit() {
		return fruit;
	}
	
	//setter ��������� ���� �ܺο��� �����ϴ� �޼���
    public void setFruit (T fruit) {
    	this.fruit = fruit;
    }
}
