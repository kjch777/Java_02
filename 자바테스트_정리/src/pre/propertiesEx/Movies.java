package pre.propertiesEx;

public class Movies implements Comparable<Movies> {
// 鞘靛
	private String 力格;
	private int 乞痢;
	private int 包按荐;
	
// 皋辑靛
	// 扁夯 积己磊
	public Movies() {
		// Ctrl + Space
	}
	// 鞘荐 积己磊
	public Movies(String 力格, int 乞痢, int 包按荐) {
		// super();
		this.力格 = 力格;
		this.乞痢 = 乞痢;
		this.包按荐 = 包按荐;
	}
	
	// Getter & Setter
	public String get力格() {
		return 力格;
	}
	public void set力格(String 力格) {
		this.力格 = 力格;
	}
	public int get乞痢() {
		return 乞痢;
	}
	public void set乞痢(int 乞痢) {
		this.乞痢 = 乞痢;
	}
	public int get包按荐() {
		return 包按荐;
	}
	public void set包按荐(int 包按荐) {
		this.包按荐 = 包按荐;
	}
	
	// @Override String toString // Alt + Shift + S + S
	@Override
	public String toString() { // int 乞痢苞 int 包按荐档 巩磊凯肺 馆券 toString
		return "力格 : " + 力格 + ", 乞痢 : " + 乞痢 + ", 包按荐 : " + 包按荐;
	}
	
	// @Override compareTo // Ctrl + Space
	@Override
	public int compareTo(Movies o) {
		return this.力格.compareTo(o.力格);
	}
	
}
