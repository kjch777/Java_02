package �ڹ�_����Ǯ��;

import java.util.*;
import java.util.Map.Entry;

public class �ǽ�����1 {

	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap();
		studentScores.put("ȫ�浿", 85);
		studentScores.put("��ö��", 60);
		studentScores.put("���缮", 88);
		studentScores.put("���ν�", 42);
				
		System.out.println("ȫ�浿�� ������ : " + studentScores.get("ȫ�浿"));

		for(Map.Entry<String, Integer> m : studentScores.entrySet()) {
			String name = m.getKey();
			int score = m.getValue();
			System.out.println("�л� �̸�: " + name + ", �л� ����: " + score);
		}
		
		studentScores.replace("���ν�", 88);
		System.out.println("���ν��� ������ : " + studentScores.get("���ν�"));
		
		studentScores.remove("���缮");
		System.out.println("���缮�� ������ : " + studentScores.get("���缮"));
		
		System.out.println("Map�� ����ֽ��ϱ�? : " + studentScores.isEmpty());
		System.out.println("Map�� ũ��� : " + studentScores.size());
	}
	
}
