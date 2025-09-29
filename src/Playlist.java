import java.util.ArrayList;

public class Playlist {
	private String name;
	private ArrayList<Song> content = new ArrayList<>();
	
	public String getName() {return name;}
	public void setName(String n) {name = n;}
	public ArrayList<Song> getContent() {return content;}
	public void setContent(ArrayList<Song> c) {content = c;}
	@Override public String toString() {return name+": \n"+content.toString();}
}
