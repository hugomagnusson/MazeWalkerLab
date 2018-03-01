import se.lth.cs.pt.maze.*;

public class MazeRunner {
	
	private Turtle turtle;
	private Maze maze;

	public MazeRunner(Turtle turtle) {
		this.turtle = turtle;
	}

	/**
	 * Låter sköldpaddan vandra genom labyrinten maze, från ingången till
	 * utgången.
	 */
	public void walk(Maze maze) {
		while(!maze.atExit(turtle.getX(), turtle.getY())){
			if (!maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY())){
				turtle.left(90);
			}
			else if (!maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY())){
				
			}
		}
	}
}
