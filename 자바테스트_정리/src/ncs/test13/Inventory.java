package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {

// �ʵ�
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
// �޼���
	// �⺻ ������
	public Inventory() {
		// Ctrl + Space
	}
	
	// �ʼ� ������ // Alt + Shift + S + O
	public Inventory(String productName, Date putDate, int putAmount) {
		// �ʼ� �����ڴ� ������ �����ص� ������ �� ����.
		// super(); �θ� Ŭ���������� �ʿ� ����.
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
		
		// ��¥ ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String putDatechange = sdf.format(putDate);
		String getDateChange = sdf.format(getDate);
		
		//           �������    -    �Ǹŷ�
		int ������ = putAmount - getAmount;
		
		return "��ǰ�� : " + productName + ", �԰��� : " + putDatechange + ", ����� : " + getDateChange
				+ ", ��� ���� : " + putAmount + ", �Ǹŷ� : " + getAmount + ", " + ������;
	}
	
	
}
