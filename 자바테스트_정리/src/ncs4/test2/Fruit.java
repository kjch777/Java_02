package ncs4.test2;

// ��
public class Fruit implements Comparable<Fruit> {

// �ʵ�
	private String name;
	private int price;
	private int quantity;

// �޼���
	// �⺻ ������
	public Fruit() {
		// Ctrl + Space
	}
	
	// �ʼ� ������
	public Fruit(String name, int price, int quantity) {
		// super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// @Override
	@Override
	public String toString() {
		return "���� ���� : " + name + ", ���� ���� : " + price + ", ���� ���� : " + quantity;
	}
	
	@Override
	public int compareTo(Fruit ���Ϻ�) {
		return this.name.compareTo(���Ϻ�.name);
		// ���� �̸����� ���ϱ�
	}
	
}
