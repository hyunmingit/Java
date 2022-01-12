package ch11;

import java.io.FileInputStream;

import java.io.FileOutputStream;


/*
 * ��¥ 2022.01.12
 * �̸� ������
 * ���� �ڹ� ���� ����� �ǽ� p496
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
			//��Ʈ�� ���� ����
			fis.close();
			fos.close();
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("Program Off...");
		
		
		
		
		
		
		
	}

}
