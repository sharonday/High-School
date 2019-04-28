/**
 * This class models a student's grades.
 * 
 * @author Daya
 *
 */
public class Student {

	// data
	private String name;
	private int totalScore;
	private int numQuiz;

	// constructors
	/**
	 * Contructs a Student with a given name.
	 * 
	 * @param nom
	 *            the name of the student
	 */
	public Student(String nom) {
		name = nom;
	}

	// methods
	/**
	 * Adds a quiz score to the student's total score.
	 * 
	 * @param score
	 *            the quiz score
	 */
	public void addQuiz(int score) {
		numQuiz++;
		totalScore += score;
	}

	/**
	 * Returns the student's name.
	 * @return the student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Reutrns the student's total score from all quizzes
	 * @return the student's total score
	 */
	public int getTotalScore() {
		return totalScore;
	}

	/**
	 * Calulates the student's average quiz score
	 * @return the student's average quiz score
	 */
	public int getAverageScore() {
		return totalScore / numQuiz;
	}

}
