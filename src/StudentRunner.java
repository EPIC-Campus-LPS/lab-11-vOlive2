import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class StudentRunner {
	public static void main(String[] args) throws IOException {
		File f = new File(filename);
		int c = 0;
		Scanner scan = new Scanner(f);
		String line;
		while(scan.hasNextLine()) {
			System.out.print(c);
			c++;
			line = scan.nextLine();
			String[] splitline = line.split(",");
			seats[Integer.parseInt(splitline[0])][Integer.parseInt(splitline[1])].buySeat();
		}
		scan.close();
	}
}
