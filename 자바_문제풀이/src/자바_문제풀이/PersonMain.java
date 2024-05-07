package 자바_문제풀이;

import java.io.*;

public class PersonMain {

	public void fileSave(String file) {
		File f = new File(file);
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			Person person = new Person("신짱구", 5);
			bw.write(person.toString());
			bw.close();
			System.out.println("저장 완료");
		} catch (IOException e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PersonMain p = new PersonMain();
		p.fileSave("person.txt");
	}
	
}
