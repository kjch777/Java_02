package �ڹ�_����Ǯ��;

import java.io.*;
import java.util.*;

public class AnimalMain {
	
	// fileSave
	public void fileSave(String fileName) {

		File file = new File(fileName);
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			Animal animal = new Animal("�ܲ���", 4);
			bw.write(animal.toString());
			System.out.println("���� �Ϸ�");
			// fw.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		// Animal animal = new Animal("�����", 2);
		// System.out.println(animal);
		AnimalMain animalMain = new AnimalMain();
		animalMain.fileSave("animal.txt"); // .Ȯ���� ���� " " �ȿ� �ۼ��Ѵ�.
		
	}
	
}
