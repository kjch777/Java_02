package ncs.test11;

import java.util.Comparator;

// ������������ �����ϴ� Comparator<Integer> ����ϱ�
public class Decending implements Comparator<Integer> {
	// �̿ϼ��� �޼��带 �ۼ��ؾ� �ϱ� ������, ���� ������ ����� ���̴�.
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	/*
	 o1 �� o2 ���� ������ �Ųٷ�
	 o1 �� o2 �� ������ 0
	 o1 �� o2 ���� ũ�� �ùٸ��� 
	 */
}
