package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		
		// 문자열을 , 를 기준으로 구분하여,
		String str = "1.22 // 4.12 // 5.93 // 8.71 // 9.34";
		
		// 배열로 만들어서 장바구니처럼 담아주기
		String[] nums = str.split("//");
		// .split("//") : // 를 기준으로 값을 나눠준다는 코드이다.
		// 이 때, // 는 , 나 기타 등등 자기 맘대로 설정할 수 있다.
		
		// , 로 나눈 실수들을 모아, double data 에 담아주기
		double data[] = new double[nums.length];
		// [nums.length] : nums 의 최대 길이만큼 장바구니 배열 크기를 생성해준다는 코드이다.
		
		// 문자열로 담겨진 배열을 실수로 변환하는 강제 형변환 사용하기
		for(int i = 0; i < nums.length; i++) {
			
			// 문자열(String) 을 실수(Double) 로 변환할 때 사용하는 코드이다.
			// Double.parseDouble(String 값)
			data[i] = Double.parseDouble(nums[i]);
			System.out.println("data[" + i + "] = " + data[i]);
		}
		
		// 실수로 변환된 값들의 합 구하기
		double sum = 0;
		for(double num : data) {
			sum += num;
		}
		
		// 평균 구하기
		double avg = sum / data.length;
		
		// 출력하기
		System.out.println("원래 값 : " + str);
		System.out.println("총  합 : " + sum);
		System.out.println("평  균 : " + avg);
	}
}
