import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class MusicRunner {
	public static ArrayList<Playlist> playlists;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException  {playlists = new ArrayList<>(getPlaylists());printMusic();menu();}
	public static void menu() throws IOException {
		while(true) {
			printMenu();
			System.out.print(
					  "(A) - View List of Playlists \n"
					+ "(B) - View a Playlist \n"
					+ "(C) - Search Songs \n"
					+ "(D) - Modify a Playlist\n");
			String input = scan.nextLine().toUpperCase();
			if(input.equals("A")) {playlistNameView();}
			else if(input.equals("B")) {playlistSongsView();}
			else if(input.equals("C")) {search();}
			else if(input.equals("D")) {playlistMod();}
			else {}
		}
	}
	public static boolean playlistNameView() throws IOException {
		for(int i = 0; i < 10; i++) {
			System.out.print(playlists.get(i).getName());
		}
		return false;
	}
	public static boolean playlistSongsView() throws IOException {
		System.out.print("What playlist do you want to view? \n");
		int input = scan.nextInt();
		System.out.print(playlists.get(input-1)+"\n");
		return false;
	}
	public static boolean search() throws IOException {
	System.out.print("What mode do you want to seach by?\n"
			+ "(A) - Artist \n"
			+ "(B) - Year \n");
	String input = scan.nextLine().toUpperCase();
	ArrayList<Song> filter = new ArrayList<>();
	String input2 = scan.nextLine().toUpperCase();
		for(int i = 0; i < playlists.size(); i++) {
			ArrayList<Song> content = playlists.get(i).getContent();
			for(int j = 0; j < content.size(); j++) {
				if(input.equals("A")) {
					if(content.get(j).getAuthor().toUpperCase().equals(input2)) {
						filter.add(content.get(j));
				}}
				else if(input.equals("B")) {
					if(content.get(j).getYear() == (Integer.parseInt(input2))) {
						filter.add(content.get(j));
				}}
			}
		}
		System.out.print(filter.toString()+"\n");
		return false;
	}
	public static boolean playlistMod() throws IOException {
		System.out.print("What playlist do you want to modify? \n");
		int input = scan.nextInt();
		System.out.print(playlists.get(input-1)+"\n");
		System.out.print("What do you want to do? \n"
				+ "(A) - Add a song\n"
				+ "(B) - Remove a song\n\r");
		String input2 = scan.next().toUpperCase();		
		if(input2.equals("A")) {
			System.out.println("<Song Name>, <Artist>, <year>");
			String l = scan.next();
			String line = scan.nextLine();
			System.out.println(line);
			String[] arr = line.split(", ");
			Song s = new Song(l.substring(0, l.length()-1), arr[0].substring(1), Integer.parseInt(arr[1]));
			playlists.get(input-1).add(s);
			System.out.print("\n" + playlists.get(input-1) + "\n");
		}
		else {
			System.out.print("Which song to remove");
			input = scan.nextInt();
			playlists.get(input-1).remove(input-1);
			System.out.print("\n" + playlists.get(input-1) + "\n");
		}
		return false;
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
			if(scan.hasNextLine()) {scan.nextLine();}
		}
		scan.close();
		return playlists;
	}
	public static boolean printMusic() throws IOException {
		System.out.print(" __  __ _   _ ____ ___ ____   ____  _        _ __   _______ ____  \r\n"
				+ "|  \\/  | | | / ___|_ _/ ___| |  _ \\| |      / \\\\ \\ / / ____|  _ \\ \r\n"
				+ "| |\\/| | | | \\___ \\| | |     | |_) | |     / _ \\\\ V /|  _| | |_) |\r\n"
				+ "| |  | | |_| |___) | | |___  |  __/| |___ / ___ \\| | | |___|  _ < \r\n"
				+ "|_|  |_|\\___/|____/___\\____| |_|   |_____/_/   \\_\\_| |_____|_| \\_\\\n\n");
		return true;
	}
	public static boolean printMenu() throws IOException {
		System.out.print(" __  __ _____ _   _ _   _ \r\n"
				+ "|  \\/  | ____| \\ | | | | |\r\n"
				+ "| |\\/| |  _| |  \\| | | | |\r\n"
				+ "| |  | | |___| |\\  | |_| |\r\n"
				+ "|_|  |_|_____|_| \\_|\\___/ \n\n");
		return true;
	}
}
