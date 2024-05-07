package com.kh.test.main.oop;

// �ڽ� Ŭ������ �θ� Ŭ������ ��ӹޱ�
// ����� extends �� ����Ͽ� ����
// �������̽��� �ƴ϶� Ŭ������ ��� ���� ������, �ϳ��� ��ӹ��� �� �ֱ� ������, extends �� ����� �� �ϳ��� Ŭ������ �ۼ����־�� �Ѵ�.
public class Child extends Parent {

// �ʵ�
	int cV; // child Variable
	
// �޼���
	// �⺻ ������
	public Child() {
		// Ctrl + Space �� constructor ǥ�ð� �ִ��� Ȯ�� �� Enter
	}
	
	/* �ʼ� ������ Alt + Shift + S �� O
	// pV �� Parent ���� ��������
	public Child(/ int pV, / int cV) {
		// super(pV); // pV �� ��� �޾Ƽ� �������ڴ� ��� �ڵ尡 ���� ������ ������ �߻��Ѵ�.
		// pV ���� �⺻ �����ڸ� �־ �ۼ����־�� �Ѵ�.
		this.cV = cV;
	}
	*/
	public Child(int cV) {
		super(); // Parent �� �⺻ �����ڸ� ȣ���ϰڴٴ� �ǹ��̴�.
		// super(pV); �ϳ��� �ڽ� �����ڿ��� 2���� super() �� ����ϴ� ���� �Ұ����ϴ�.
		// ���� super() �� �θ� Ŭ������ �⺻ �����ڿ� �ʼ� �����ڸ� ���� �ҷ����� �ʹٸ�,
		// �ڽ� �����ڵ� 2�� ���� super() �� ���� �ϳ��� ������־�� �Ѵ�.
		// ������ �׷��� ����� ���� ��ǻ� ����.
		this.cV = cV;
	}
	
	public Child(int pV, int cV) {
		super(pV); // �θ� Ŭ�������� �ʼ� �����ڸ� ȣ���� ����ϰڴٴ� �ǹ��̴�.
		this.cV = cV;
	}

	public void cMethod() {
		super.pMethod();
		System.out.println("�ڽ��� ȣ��ƽ��ϴ�.");
	}
}
