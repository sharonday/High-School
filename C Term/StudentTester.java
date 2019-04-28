import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);
		System.out.println("Name: ");
		Student stu = new Student(steve.next());
		int quit = 0;
		int score;
		while (quit != -1) {
			System.out.println("quiz score (-1 for quit): ");
			score = steve.nextInt();
			if (score == -1) {
				quit = -1;
				break;
			} else {
				stu.addQuiz(score);

			}
		}
		System.out.println("name: " + stu.getName());
		System.out.println("total: " + stu.getTotalScore());
		System.out.println("average: " + stu.getAverageScore());

	}

}
