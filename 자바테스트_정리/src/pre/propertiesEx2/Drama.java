package pre.propertiesEx2;

public class Drama implements Comparable<Drama>{
	
// 필드
	private String 제목;
	private int 제작년도;
	private int 총회차수;
	
// 메서드
	// Getter Setter // Alt + Shift + S
	public String get제목() {
		return 제목;
	}
	
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	
	public int get제작년도() {
		return 제작년도;
	}
	
	public void set제작년도(int 제작년도) {
		this.제작년도 = 제작년도;
	}
	
	public int get총회차수() {
		return 총회차수;
	}
	
	public void set총회차수(int 총회차수) {
		this.총회차수 = 총회차수;
	}
	
	// 기본 생성자
	public Drama() {
		// Ctrl + Space
	}

	// 필수 생성자 // Alt + Shift + S + O
	public Drama(String 제목, int 제작년도, int 총회차수) {
		// super();
		this.제목 = 제목;
		this.제작년도 = 제작년도;
		this.총회차수 = 총회차수;
	}

	// toString // Alt + Shift + S + S
	@Override
	public String toString() {
		return "드라마 제목 : " + 제목 + ", 제작 년도 : " + 제작년도 + ", 총 회차 수 : " + 총회차수;
	}
	
	// compareTo
	@Override
	public int compareTo(Drama o) {
		// Ctrl + Space
		return this.제목.compareTo(o.제목);
	}
}
