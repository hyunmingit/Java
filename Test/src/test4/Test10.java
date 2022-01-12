package test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Orange implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Orange(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("Country : "+country);
		System.out.println("Price : "+price);
	}
	
	
}







public class ReadObjectTest {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("./Orange.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Orange a1 = (Orange) ois.readObject();
			Orange a2 = (Orange) ois.readObject();
			
			a1.show();
			a2.show();
			
			ois.close();
			fis.close();
		}catch (FileNotFoundException e) {
			System.out.println("orange.txt 존재안함");
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}

public class Test10 {
	public static void main(String[] args) throws Exception{
		
		Orange Orange1 = new Orange("Korea", 3000);
		Orange Orange2 = new Orange("America", 3000);
		
		FileOutputStream fos = new FileOutputStream("./Orange.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Orange1);
		oos.writeObject(Orange2);
		
		oos.close();
		fos.close();
		System.out.println("현재 폴더에 파일 생성 완료");
		
		
		
	}
	
}
