package ch04;

class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title );
	}
	
}
public class Example3 {
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();
	}

}
