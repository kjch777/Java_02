package �ڹ�_����Ǯ��;

import java.io.*;

public class PersonMain {

	public void fileSave(String file) {
		File f = new File(file);
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			Person person = new Person("��¯��", 5);
			bw.write(person.toString());
			bw.close();
			System.out.println("���� �Ϸ�");
		} catch (IOException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PersonMain p = new PersonMain();
		p.fileSave("person.txt");
	}
	
}
