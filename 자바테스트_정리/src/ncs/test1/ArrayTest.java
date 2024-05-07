package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] array /* 배열 안에 또 배열 */ = {
											{12, 41, 36, 56, 21}, 
										    {82, 10, 12, 61, 45},
										    {14, 16, 18, 78, 65},
										    {45, 26, 72, 23, 34}
										 					    };
		
		/*
		 int[][] array == int array[][] : 장바구니가 2개인 상태이다. 
		 * */
		
		// 2차원 배열에 들어 있는 데이터들의 합계와 평균 구하기
		int sum = 0;
		int count = 0;
		
		// for - each 문을 2중 작성하여 계산하기
		for(int[] row : array) { // 배열을 한줄씩 꺼내기 : 배열 안에 또 배열
			System.out.println("===== 시작 ======");
			for(int num : row) { // 한줄씩 꺼낸걸 한개씩 꺼내기
				sum += num;
				count++; // 횟수를 세는 이유는, 나중에 숫자들의 평균을 구할 때 필요하기 때문이다.
			}
			
			double avg = sum / count;
			
			System.out.println("총합 : " + sum);
			System.out.println("평균 : " + avg);
			
		}
	}
}
