package ncs.test10;

public class BookStore {
	public static void main(String[] args) {
		
		/*
		 �ڷ��� ������ = ���ͷ�(��); // �޸� ��뷮�� ����. �����ϸ� �� ����� ����ϴ� ���� ����.
		 
		 �ڷ��� ������;
		 ������ = ���ͷ�(��); // �޸� ��뷮�� ����. 
		 */
		
		Book bI;
		bI = new Book("IT", "HTML5", 30000.0, 15.0);
		System.out.println("===== ��� ���� =====");
		System.out.println(bI.getBookName() + " // " + bI.getBookPrice());
		
		BookUpdate bI2 = new BookUpdate(bI);
		bI2.updateBookPrice();
		System.out.println("===== ���� ���� =====");
		System.out.println(bI.getBookName() + " // " + bI.getBookPrice());
	}
}
