package 자바_문제풀이;

public class Movie {

	private String title;
	private String genre;
	
	public Movie() {
		// Ctrl + Space
	}

	public Movie(String title, String genre) {
		// super(); 부모 클래스에서는 필요 없다.
		this.title = title;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
