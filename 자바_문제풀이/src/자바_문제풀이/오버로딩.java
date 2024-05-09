package 자바_문제풀이;

public class 오버로딩 {
	
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
		return "테스트"; // return 으로 반환하는 값과 매개변수 형은 서로 달라도 상관없다.
	}
	public int test(short i, short l) {
		return 0;
	}
	public double test(short i, String j) {
		return 1.5;
	}
	// 매개변수의 종류, 갯수, 순서 중에 하나만 달라도 다른 것으로 친다.
	
}
