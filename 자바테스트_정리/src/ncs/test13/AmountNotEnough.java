package ncs.test13;
// extends Exception
public class AmountNotEnough extends Exception {
	// 양이 충분하지 않을 때 출력되는 오류 문구를 개발자가 만들어 둔 것이다.
	
	public AmountNotEnough (String msg) {
		// if throw new 원래는 여기에 작성해주는게 좋은 것 같다.
		super(msg);
	}
	
}
