package com.kh.PropertiesPre;
// ����Ű : Ctrl + Shift + S == ��� �Ѳ����� �����ϱ�
import java.util.Map;
import java.util.Properties;

public class PropertiesPre {

	public static void main(String[] args) {
		Properties ���� = new Properties();
		
		// �Ӽ� ����
		����.setProperty("�̸�", "��ö��");
		����.setProperty("����", "15"); // ���ڸ� ������ ��� ǥ��� " " �ȿ� �ۼ����־�� �Ѵ�.
		����.setProperty("�ּ�", "����");
		
		// Ư�� �� ��ȸ�ϱ�
		String �̸���ȸ = ����.getProperty("�̸�");
		System.out.println("�̸� : " + �̸���ȸ);
		
		// ��ü ��ȸ�ϱ�
		System.out.println("===== ��ü ��ȸ =====");
		
		// Properties �� Map.Entry �� ����Ͽ� ��ü ��ȸ�� �� �� �ִ�.
		// Properties �� ���ڿ��� Ű�� ���� �ۼ�������, Object �� ��� �Ѵ�.
		for(Map.Entry<Object, Object> e : ����.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
	}
	
}
