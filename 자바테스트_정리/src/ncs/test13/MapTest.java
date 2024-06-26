package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Inventory> inventoryMap = new HashMap(); // 뒤에는 <자료형> 생략 가능
		
		// 날짜 입력을 위한 Calendar 불러오기
		Calendar 달력 = Calendar.getInstance();
		// Calendar 는 달력이기 때문에, 최초 1회만 생성하면 되고
		
		달력.set(2016, 달력.MARCH, 15); // 이걸로 값을 바꿔주면 된다.
		inventoryMap.put("삼성 갤럭시 S7", new Inventory("삼성 갤럭시 S7", 달력.getTime(), 30));
		
		달력.set(2016, 달력.FEBRUARY, 25); // 이걸로 값을 바꿔주면 된다.
		inventoryMap.put("LG G5", new Inventory("LG G5", 달력.getTime(), 20));
		
		달력.set(2016, 달력.JANUARY, 23); // 이걸로 값을 바꿔주면 된다.
		inventoryMap.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", 달력.getTime(), 15));
		
		try {
		
		달력.set(2016, 달력.APRIL, 28); // 이걸로 값을 바꿔주면 된다.
		inventoryMap.get("삼성 갤럭시 S7").setGetDate(달력.getTime()); // 출고일
		inventoryMap.get("삼성 갤럭시 S7").setGetAmount(10); // 출고 수량
		
		inventoryMap.get("LG G5").setGetDate(달력.getTime());
		inventoryMap.get("LG G5").setGetAmount(10);
		
		inventoryMap.get("애플 아이패드 Pro").setGetDate(달력.getTime());
		inventoryMap.get("애플 아이패드 Pro").setGetAmount(10);
		
		// 만약 제품이 존재하지 않을 경우, AmonutNotEnough catch문 사용
		for(Inventory 인벤토리 : inventoryMap.values()) {
			// 내가 가지고 있는 양 < 출고 양 일 경우
			
			// 판매하고자 하는 양 > 현재 가지고 있는 양
			if(인벤토리.getGetAmount() > 인벤토리.getPutAmount()) {
				throw new AmountNotEnough("출고 수량이 재고 수량을 초과했습니다.");
			}
		}
		
		} catch (AmountNotEnough e) {
			e.printStackTrace(); // .printStackTrace() 오류 출력하여 보여주기
		}
		
		// for-each 문을 사용하여
		for(Inventory e : inventoryMap.values()) {
			System.out.println(e.toString()); // 상품 정보 출력하기
		}
	}
}
