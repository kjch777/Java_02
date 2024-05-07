package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {

// 필드
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
// 메서드
	// 기본 생성자
	public Inventory() {
		// Ctrl + Space
	}
	
	// 필수 생성자 // Alt + Shift + S + O
	public Inventory(String productName, Date putDate, int putAmount) {
		// 필수 생성자는 내용을 수정해도 괜찮은 것 같다.
		// super(); 부모 클래스에서는 필요 없다.
		this.productName = productName;
		this.putDate = putDate;
		// this.getDate = getDate;
		this.putAmount = putAmount;
		// this.getAmount = getAmount;
		// this.inventoryAmount = inventoryAmount;
	}

	// Getter Setter
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Date getPutDate() {
		return putDate;
	}
	
	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	
	public Date getGetDate() {
		return getDate;
	}
	
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	
	public int getPutAmount() {
		return putAmount;
	}
	
	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}
	
	public int getGetAmount() {
		return getAmount;
	}
	
	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}
	
	public int getInventoryAmount() {
		return inventoryAmount;
	}
	
	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	// @Override String toString return ""; // Alt + Shift + S + S
	@Override
	public String toString() {
		
		// 날짜 형식 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String putDatechange = sdf.format(putDate);
		String getDateChange = sdf.format(getDate);
		
		//           현재재고    -    판매량
		int 재고수량 = putAmount - getAmount;
		
		return "제품명 : " + productName + ", 입고일 : " + putDatechange + ", 출고일 : " + getDateChange
				+ ", 재고 수량 : " + putAmount + ", 판매량 : " + getAmount + ", " + 재고수량;
	}
	
	
}
