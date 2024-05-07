package 자바_문제풀이;

import java.io.*;
import java.util.*;

public class AnimalMain {
	
	// fileSave
	public void fileSave(String fileName) {

		File file = new File(fileName);
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			Animal animal = new Animal("꿀꿀이", 4);
			bw.write(animal.toString());
			System.out.println("저장 완료");
			// fw.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		// Animal animal = new Animal("댕댕이", 2);
		// System.out.println(animal);
		AnimalMain animalMain = new AnimalMain();
		animalMain.fileSave("animal.txt"); // .확장자 까지 " " 안에 작성한다.
		
	}
	
}
