package �ڹ�_����Ǯ��;

import java.io.*;
/*
 �̾ �ۼ��ϱ� 
 */
public class FileMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true);
			fw.write("\n�ڻԼ�, 10");
			fw.write("\n�ڳ��� ģ�� �ڻԼ�");
			fw.close(); // .close(); �� �ݾ��־�� ������ �Ϸ�ȴ�.
			System.out.println("�̾�� ����Ϸ�");
		} catch (IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
}
