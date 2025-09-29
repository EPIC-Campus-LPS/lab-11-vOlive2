import java.util.ArrayList;

public class Playlist {
	private String name;
	private ArrayList<Song> content = new ArrayList<>();
	Playlist (String n, ArrayList<Song> c) {name = n;content = c;}

	public String getName() {return name;}
	public void setName(String n) {name = n;}
	public ArrayList<Song> getContent() {return content;}
	public void setContent(ArrayList<Song> c) {content = c;}
	
	public ArrayList<Song> remove(int i) {content.remove(i);return content;}
	public ArrayList<Song> add(Song s) {content.add(s);return content;}

	@Override public String toString() {return name+": \n"+content.toString();}
}
