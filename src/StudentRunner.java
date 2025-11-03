import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class StudentRunner {
	
	public static void main(String[] args) throws IOException {
		Student[] kids = new Student[16];
		for(int i = 0; i < 9; i++) {
			String filename = "student_grades/S00"+(i+1)+"_grades.txt";
			kids = get(filename, i, kids);
		}
		for(int i = 9; i < 16; i++) {
			String filename = "student_grades/S0"+(i+1)+"_grades.txt";
			kids = get(filename, i, kids);
		}
		int m=0, s=0, h=0, e=0, c=0;
		for(int i = 0; i < 16; i++) {
			m+=kids[i].getMath();
			s+=kids[i].getScience();
			h+=kids[i].getHistory();
			e+=kids[i].getEnglish();
			c+=kids[i].getCom();
		}
		System.out.println("Math : " + m/16.0);
		System.out.println("Science : " + s/16.0);
		System.out.println("History : " + h/16.0);
		System.out.println("English : " + e/16.0);
		System.out.println("Computer Science" + c/16.0);
	}
	public static Student[] get(String filename, int i, Student[] kids) throws IOException {
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
			Student kid = new Student(m, s, h, e, c);
			//System.out.println(kid);
			kids[i] = kid;
			//System.out.println(kids[i]);
		}
		scan.close();
		return kids;
	}
}
