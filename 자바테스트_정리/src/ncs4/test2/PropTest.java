package ncs4.test2;

import java.io.*;
import java.util.*;

public class PropTest {
	// ���� ����
	public static void fileSave(Properties p) throws IOException {
		// Properties ��ü�� ������ �����ϱ�
		// .setProperty("", ""); // "" �ۿ��� , �� �ϳ��� �����ؾ� �ϸ�,
		// "" �ȿ��� ���⵵ �ν��Ѵ�.
		p.setProperty("1", "apple, 1200, 3");
		p.setProperty("2", "banana, 2500, 2");
		p.setProperty("3", "grape, 4500, 5");
		p.setProperty("4", "orange, 800, 10");
		p.setProperty("5", "melon, 5000, 2");
		
		// Properties ��ü�� xml ���Ϸ� �����ϱ�
		FileOutputStream fos = new FileOutputStream("data.xml");
		p.storeToXML(fos, null); // xml ���Ϸ� �����ϰڴٴ� �ڵ�
		// fos : ������� �Է��ϰڴٴ� �ڵ� // null : �ڸ�Ʈ�� ������ �޾Ƽ� �����ϰڴٴ� �ڵ�
		// �߰��� �ۼ��� ������ ������ null �� ó����.
		fos.close(); // ����
	}
	
	// ���� �б�
	public static void fileOpen(Properties p) {
		try {
			// Properties ��ü�� xml ���� ���� �о�� �غ��ϱ�
			FileInputStream fis = new FileInputStream("data.xml");
			
			p.loadFromXML(fis);
			fis.close(); // ����
			
			// Properties ��ü�� Ű-�� �������� Fruit ��ü�� List �� �����ϱ�
			List<Fruit> fruits = new ArrayList();
			
			// ���Ͽ� �����ϱ�
			for(String key : p.stringPropertyNames()) { // ������ �ۼ��Ǿ� �ִ� ���� ������ �̸��� �����ͼ�,
				// key �� �ֱ�
				String[] values = p.getProperty(key).split(", ");
				// "apple, 1_200, 3" �� , �� �����Ͽ� ���� ���� �����ϰڴٴ� �ڵ�
				
				//                    "apple",                      1200,                             3
				//                     String                  String �� int                    String �� int
				Fruit ���� = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
				fruits.add(����);
				
				// List �� �迭�� ��ȯ�ϰ�, ������������ �����ϱ�
				Fruit[] ���Ϲ迭 = fruits.toArray(new Fruit[0]);
				
				// �����ϱ�
				Arrays.sort(���Ϲ迭);
				
				// Fruit ���Ϲ迭 ����ϱ�
				System.out.println("Fruit ���� �迭 ���");
				for(Fruit f : ���Ϲ迭) {
					System.out.println(f);
				}
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
			
		}
		
	// ���� ���
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		fileSave(prop);
		fileOpen(prop);
	}
}
