import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class MusicRunner {
	private ArrayList<Playlist> playlists = new ArrayList<>(getPlaylists());
	public static void main(String[] args) throws IOException  {menu();}
	public static void menu() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print(""
				+ "(A) - View List of Playlists \n"
				+ "(B) - View a Playlist \n"
				+ "(C) - Search Songs \n"
				+ "(D) - Modify a Playlist");
		String input = scan.nextLine().toUpperCase();
		if(input.equals("A")) {playlistNameView();}
		else if(input.equals("B")) {playlistSongsView();}
		else if(input.equals("C")) {search();}
		else if(input.equals("D")) {playlistMod();}
		else {menu();}
	}
	public static void playlistNameView() throws IOException {
		
	}
	public static void playlistSongsView() throws IOException {
		
	}
	public static void search() throws IOException {
	
	}
	public static void playlistMod() throws IOException {
	
	}
	public static ArrayList<Playlist> getPlaylists() throws IOException {
		File file = new File("playlist.txt");
		Scanner scan = new Scanner(file);
		ArrayList<Playlist> playlists = new ArrayList<>();
		while(scan.hasNextLine()) {
			Playlist inputPlaylist = new Playlist(scan.nextLine(), new ArrayList<Song>());
			for(int i = 0; i <=4; i++) {
				String line = scan.nextLine();
				Scanner lineScanner = new Scanner(line);
				String[] arr = line.split(", ");
				Song s = new Song(arr[0], arr[1], Integer.parseInt(arr[2]));
				inputPlaylist.add(s);
			}
			playlists.add(inputPlaylist);
			if(scan.hasNextLine()) {scan.next();}
		}
		scan.close();
		return playlists;
	}
}
