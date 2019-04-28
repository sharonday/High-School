
public class BugTester {

	public static void main(String[] args) {
		Bug bug = new Bug(4);
		System.out.println(bug.getPosition());
		bug.move();
		bug.move();
		bug.turn();
		System.out.println(bug.getPosition());
		bug.move();
		bug.move();
		bug.turn();
		System.out.println(bug.getPosition());
		bug.move();
		bug.move();
		bug.turn();
		System.out.println(bug.getPosition());
		bug.move();
		bug.move();
		bug.turn();
		System.out.println(bug.getPosition());
	}

}
