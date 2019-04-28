/**
 * This class models the behavior of a bug.
 * 
 * @author Daya
 *
 */
public class Bug {

	// data
	private int position;
	private int dir = 1;

	// constructors
	/**
	 * Constructs a Bug at a given position.
	 * 
	 * @param initialPosition
	 *            the bug's initial position
	 */
	public Bug(int initialPosition) {
		position = initialPosition;
	}

	// methods
	/**
	 * Turns the Bug around so that it moves in the opposite direction.
	 */
	public void turn() {
		dir = -dir;
	}

	/**
	 * Moves the Bug one unit over in the current direction.
	 */
	public void move() {
		position += dir;
	}

	/**
	 * Returns the Bug's current position.
	 * 
	 * @return the current position
	 */
	public int getPosition() {
		return position;
	}
}
