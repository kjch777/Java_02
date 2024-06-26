package ncs.test8;

public class User {
		
// 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	private char gender;
	private String phone;
		
// 메서드
	// Getter
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	// Setter
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 기본 생성자
	public User() {
		
	}
	
	// 필수 생성자
	public User(String id, String pw, String name, int age, char gender, String phone) {
		// super(); 부모 클래스에선 필요 없다.
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone="
				+ phone + ", toString()=" + super.toString() + "]";
	}
	
	// clone
	// 객체 본사본 cloneable
	@Override
	public User clone() {
		return new User(this.id, this.pw, this.name, this.age, this.gender, this.phone);
	}
	
}
