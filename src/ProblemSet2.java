import java.util.Scanner;

public class ProblemSet2 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}

	
	public void sayHello() {
		System.out.println("What is your first name?");
		String firstname = in.nextLine();
		System.out.println("What is your last name?");
		String lastname = in.nextLine();
		System.out.println("Hello, " + firstname + " " + lastname);
	}
	
	public void gradeMe() {
		System.out.println("What is your first homework grade?");
		double hw1 = in.nextDouble();
		System.out.println("What is your second homework grade?");
		double hw2 = in.nextDouble();
		System.out.println("What is your third homework grade?");
		double hw3 = in.nextDouble();
		double hwAvg = ((double)hw1 + hw2 + hw3)/3;
		System.out.println("What is your first quiz grade?");
		int quiz1 = in.nextInt();
		System.out.println("What is your second quiz grade?");
		int quiz2 = in.nextInt();
		System.out.println("What is your third quiz grade?");
		int quiz3 = in.nextInt();
		double quizAvg = ((double)quiz1 + quiz2 + quiz3)/3;
		System.out.println("What is your first test grade?");
		int test1 = in.nextInt();
		System.out.println("What is your second test grade?");
		int test2 = in.nextInt();
		System.out.println("What is your third test grade?");
		int test3 = in.nextInt();
		double testAvg = ((double)test1 + test2 + test3)/3;
		double finalGrade = .15*hwAvg + 0.3*quizAvg + 0.55*testAvg;
		System.out.println("Final Grade: " + finalGrade);
	}
	
	public void groupUs() {
		System.out.println("How many teachers are going?");
		int teachers = in.nextInt();
		System.out.println("How many students are going?");
		int students = in.nextInt();
		int people = students + teachers;
		int buses = people/47;
		int remainder = people % 47;
		if (remainder != 0) {
			buses++;
		}
		System.out.println("There will be " + buses + " buses. The last bus will have " + remainder + " people.");
		in.nextLine();
	}
	
	public void info() {
		System.out.println("What is your first name?");
		String firstname = in.nextLine();
		System.out.println("What is your last name?");
		String lastname = in.nextLine();
		System.out.println("What is your grade?");
		int grade = in.nextInt();
		System.out.println("What is your age?");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("What is your hometown?");
		String town = in.nextLine();
		System.out.println("NAME: \t\t" + firstname + " " + lastname + "\nGRADE: \t\t" + grade + "\nAGE: \t\t" + age + "\nHOMETOWN:\t" + town);
	}
	
	public void initials() {
		System.out.println("What is your first name?");
		char first = in.next().charAt(0);
		System.out.println("What is your middle name?");
		char middle = in.next().charAt(0);
		System.out.println("What is your last name?");
		char last = in.next().charAt(0);
		System.out.println("Your initials are " + first + middle + last);
		in.close();
	}
}