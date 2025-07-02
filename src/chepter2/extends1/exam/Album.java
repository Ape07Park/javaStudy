package chepter2.extends1.exam;

public class Album extends Item{

	private String artist;

	public Album(String name, int price, String artist) {
		super(name, price);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("- 아티스트: " + artist );
	}
}
