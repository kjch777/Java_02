package pre.propertiesEx2;

public class Drama implements Comparable<Drama>{
	
// �ʵ�
	private String ����;
	private int ���۳⵵;
	private int ��ȸ����;
	
// �޼���
	// Getter Setter // Alt + Shift + S
	public String get����() {
		return ����;
	}
	
	public void set����(String ����) {
		this.���� = ����;
	}
	
	public int get���۳⵵() {
		return ���۳⵵;
	}
	
	public void set���۳⵵(int ���۳⵵) {
		this.���۳⵵ = ���۳⵵;
	}
	
	public int get��ȸ����() {
		return ��ȸ����;
	}
	
	public void set��ȸ����(int ��ȸ����) {
		this.��ȸ���� = ��ȸ����;
	}
	
	// �⺻ ������
	public Drama() {
		// Ctrl + Space
	}

	// �ʼ� ������ // Alt + Shift + S + O
	public Drama(String ����, int ���۳⵵, int ��ȸ����) {
		// super();
		this.���� = ����;
		this.���۳⵵ = ���۳⵵;
		this.��ȸ���� = ��ȸ����;
	}

	// toString // Alt + Shift + S + S
	@Override
	public String toString() {
		return "��� ���� : " + ���� + ", ���� �⵵ : " + ���۳⵵ + ", �� ȸ�� �� : " + ��ȸ����;
	}
	
	// compareTo
	@Override
	public int compareTo(Drama o) {
		// Ctrl + Space
		return this.����.compareTo(o.����);
	}
}
