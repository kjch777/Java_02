package sup1.model;

public class Score {

	// 필드
	private int kor;
	private int eng;
	private int mth;
	private int sum;
	private double avg;

	// 메서드
		// 필수 생성자
		public Score(int kor, int eng, int mth) {
			// super(); 부모 클래스에서는 필요 없다.
			this.kor = kor;
			this.eng = eng;
			this.mth = mth;
		}

		// 출력 void
		public void result() {
			sum = kor + eng + mth;
			avg = sum / 3.0;
			String 결과 = (kor >= 50 && eng >= 50 && mth >= 50) ? "합격" : "불합격";
			
				System.out.println("국어 점수는 " + kor + "점 입니다.");
				System.out.println("영어 점수는 " + eng + "점 입니다.");
				System.out.println("수학 점수는 " + mth + "점 입니다.");
			System.out.println("학생의 시험 결과는 " + 결과 + "입니다.");
		}
}
