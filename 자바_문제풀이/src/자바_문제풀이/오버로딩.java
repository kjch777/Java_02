package �ڹ�_����Ǯ��;

public class �����ε� {
	
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
	public void test(String s, int i) {}
	private void test(int i, String s) {}
	public void test(char a, int i) {}
	void test(char ch) {}
	public void test(boolean a) {}
	public void test(int a, boolean b) {}
	public void test(short s) {}
	public void test(long s, short c) {}
	public void test(int a, String b, char c) {}
	public void test(int a, String b, boolean c) {}
	public void test(String c, int b, long a) {}
	public void test(short a, String c, int b) {}
	public void test(boolean a, boolean b, int i) {}
	public void test(boolean a, boolean b, long l) {}
	public String test(boolean a, char b) {
		return "�׽�Ʈ"; // return ���� ��ȯ�ϴ� ���� �Ű����� ���� ���� �޶� �������.
	}
	public int test(short i, short l) {
		return 0;
	}
	public double test(short i, String j) {
		return 1.5;
	}
	// �Ű������� ����, ����, ���� �߿� �ϳ��� �޶� �ٸ� ������ ģ��.
	
}
