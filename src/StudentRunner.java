import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class StudentRunner {
	static Student[] kids = new Student[16];
	public static void main(String[] args) throws IOException {
		for(int i = 1; i <= 16; i++) {
			String filename = "S000"+i+"_grades.txt";
			get(filename, i);
		}
		int m=0, s=0, h=0, e=0, c=0;
		for(int i = 0; i < 16; i++) {
			m+=kids[i].getMath();
			m+=kids[i].getMath();
		}
	}
	public static void get(String filename, int i) throws IOException {
		File f = new File(filename);
		Scanner scan = new Scanner(f);
		String line = scan.nextLine();
		while(scan.hasNextLine()) {
			String splitline[] = scan.nextLine().split(": ");
			int m = Integer.parseInt(splitline[1]);
			splitline = scan.nextLine().split(": ");
			int s = Integer.parseInt(splitline[1]);
			splitline = scan.nextLine().split(": ");
			int h = Integer.parseInt(splitline[1]);
			splitline = scan.nextLine().split(": ");
			int e = Integer.parseInt(splitline[1]);
			splitline = scan.nextLine().split(": ");
			int c = Integer.parseInt(splitline[1]);
			kids[i] = new Student(m, s, h, e, c);
		}
		scan.close();
		
	}
}
