import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class MusicRunner {
	public static void main(String[] args) throws IOException {
	}
	
	public static ArrayList<Playlist> getPlaylists() {
		File file = new File("playlist.txt");
		Scanner scan = new Scanner(file);
		ArrayList<Playlist> playlists = new ArrayList<>();
		
		int c = 0;
		while(scan.hasNextLine()) {
			Playlist inputPlaylist = new Playlist(scan.nextLine(), new ArrayList<Song>());

			for(int i = 0; i <= 5; i++) {
				String line = scan.nextLine();
				Scanner lineScanner = new Scanner(line);
				lineScanner.next();
				Song s = new Song(lineScanner.nextLine(), lineScanner.nextLine(), lineScanner.nextInt());
				inputPlaylist.add(s);
			}
			c++;
		int area = 0;
		for(CampObject i : campObjects) {
			area += i.getArea();
		}
		scan.close();
		System.out.println("Park Area: " + area + ". Thats a Pretty Big Park!");
	}
	}
}
