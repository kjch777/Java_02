package sup1.model;

public class Score {

	// �ʵ�
	private int kor;
	private int eng;
	private int mth;
	private int sum;
	private double avg;

	// �޼���
		// �ʼ� ������
		public Score(int kor, int eng, int mth) {
			// super(); �θ� Ŭ���������� �ʿ� ����.
			this.kor = kor;
			this.eng = eng;
			this.mth = mth;
		}

		// ��� void
		public void result() {
			sum = kor + eng + mth;
			avg = sum / 3.0;
			String ��� = (kor >= 50 && eng >= 50 && mth >= 50) ? "�հ�" : "���հ�";
			
				System.out.println("���� ������ " + kor + "�� �Դϴ�.");
				System.out.println("���� ������ " + eng + "�� �Դϴ�.");
				System.out.println("���� ������ " + mth + "�� �Դϴ�.");
			System.out.println("�л��� ���� ����� " + ��� + "�Դϴ�.");
		}
}
