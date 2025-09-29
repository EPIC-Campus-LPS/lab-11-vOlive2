public class Song {
	private String name;
	private String author;
	private int year;
	
	public String getName() {return name;}
	public void setName(String n) {name = n;}
	public String getAuthor() {return author;}
	public void setAuthor(String a) {author = a;}
	public int getYear() {return year;}
	public void setYear(int y) {year = y;}
	@Override public String toString() {return name+", "+author+", "+year;}
}
