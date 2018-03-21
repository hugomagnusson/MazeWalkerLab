import se.lth.cs.pt.maze.*;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeRunner {
	
	private Turtle turtle;
	private Maze maze;
	private int mazeNr;

	public MazeRunner(Turtle turtle, int nr) {
		this.turtle = turtle;
		mazeNr = nr;
	}

	/**
	 * Låter sköldpaddan vandra genom labyrinten maze, från ingången till
	 * utgången.
	 */
	public void walk(Maze maze, SimpleWindow w) {
		
		turtle.penDown();
		boolean left;
		boolean front;
		
		while(!maze.atExit(turtle.getX(), turtle.getY())){
			
			left = maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY());
			front = maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY());
			
			if (!left){
				turtle.left(90);
				System.out.println("left - no wall");
			}
			else if (left && front){
				turtle.left(270);
				System.out.println("left - wall");
			}
				
			if (!front) {
				turtle.forward(1);
				System.out.println("forward");
			}
			
			if(mazeNr > 4) {
				w.delay(1);
			}
			else {
				w.delay(10);
			}
		}
		
		System.out.println("finished");
	}
}
