package pre.propertiesEx;

import java.io.*;
import java.util.*;

public class PropTest {
	
	public static void fileOpen(Properties p) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("movies.xml"); // open �� input
			p.loadFromXML(fis); // Properties.xml ���� ��������(FileInputStream);
			fis.close(); // FileInputStream ������
			
			List<Movies> movieList = new ArrayList(); // ����Ʈ �����
			
			for(String s : p.stringPropertyNames()) {
				// ���ڿ� �� : ���� ����.���ڿ��� �Ǿ� �ִ� ���� �̸���
				
				String[] values = p.getProperty(s).split(", ");
				// ���ڿ� �迭�� ���� ����.���ڿ� ���� (,����) �� �������� �����Ͽ� ���� �ϳ��� ����ֱ�
				
				String ���� = values[0]; // ���ڿ� �迭�� 0�� �ε����� �ִ� ���� title �̴�. �� ������ ���ڿ� ������ ���� �����Ѵ�.
				
				int ���� = Integer.parseInt(values[1]); // ���ڿ� ���� ���� ������ �������ִ� �ڵ�
				int ������ = Integer.parseInt(values[2]); // ���ڿ� ���� ���� ������ �������ִ� �ڵ�
				
				Movies ��ȭ�� = new Movies(����, ����, ������); // Movies ��ȭ�� �̶�� �� ������ �����, �ű⿡ ����, ����, �������� ������ ���� �ִ´�.
				
				movieList.add(��ȭ��); // ����Ʈ�� �� ����ֱ�
				
				Movies[] ����                		=	 movieList.toArray(new Movies[0]); 
				// �迭�� ������ ������ �� �� �ִ�.         ����Ʈ�� �ִ� ������ �̸������� �����ϰڴٴ� �ڵ�
				
				Arrays.sort(����); // ���� ���� �����ϱ�
				
				System.out.println("===== ��ȭ ��� =====");
				
				for(Movies m : movieList) {
				// ����Ʈ�� �ִ� ���� �ϳ��ϳ� ������
					
					System.out.println(m);
				}
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void fileSave(Properties p) {
		// Properties �� xml ���Ϸ� ���� �����ϱ�
		p.setProperty("1", "�йи���, 4, 2000");
		p.setProperty("2", "������Ż, 5, 2023");
		p.setProperty("3", "����ο�, 5, 2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movies are fun.");
			fos.close(); // ���� ���� �� ���� 
			System.out.println("������ movies.xml ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		Properties p = new Properties();
		fileSave(p);
		
	}
	
}
