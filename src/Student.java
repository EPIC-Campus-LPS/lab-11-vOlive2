
public class Student {
	private int Math;
	private int Science;
	private int History;
	private int English;
	private int Computer;
	public Student(int m, int s, int h, int e, int c) {
		Math = m;
		Science = s;
		History = h;
		English = e;
		Computer = c;
	}
	public int getMath() {return Math;}
	public int getScience() {return Science;}
	public int getHistory() {return History;}
	public int getEnglish() {return English;}
	public int getCom() {return Computer;}
	@Override public String toString() {return "Student{" + Math +", "+ Science + ", " + History + ", " + English + ", " + Computer + "}";
	}
}
