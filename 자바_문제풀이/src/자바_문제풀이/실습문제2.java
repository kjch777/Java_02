package �ڹ�_����Ǯ��;

import java.util.*;

public class �ǽ�����2 {
	
	public static void main(String[] args) {
		List<String> student = new ArrayList(Arrays.asList("ȫ�浿", "��ö��", "���缮"));
		student.add("���ν�");
		
		for(String name : student) {
			System.out.println(name);
		}
		
		System.out.println("index 0��° �л� �̸���: " + student.get(0));
		
		student.set(1, "�̿���");
		
		System.out.println("index 1��° �л� �̸���: " + student.get(1));
		
		student.remove("���缮");
		
		System.out.println("���缮�� ���ԵǾ� �ֽ��ϱ�?: " + student.contains("���缮"));
		
		System.out.println("�л� ����Ʈ�� ũ���: " + student.size());
		
		System.out.println("�л� ����Ʈ�� ��� �ֽ��ϱ�?: " + student.isEmpty());
	}

}
