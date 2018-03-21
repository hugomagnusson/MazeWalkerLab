import java.util.Scanner;

import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeWindu {

	private Maze mufasa;
	private Turtle turtleeee;
	private MazeRunner mofarah;
	private Scanner scar;
	private static MazeWindu jedi;
	private SimpleWindow botadeJesusAndraDjurOckså;

	public static void main(String[] args) {
		
		jedi = new MazeWindu();
		jedi.hakunamatata();

	}

	public void hakunamatata() {
		boolean görAttManBlirGlaaaad = true;
		
		if (görAttManBlirGlaaaad){
			
		botadeJesusAndraDjurOckså = new SimpleWindow(500, 500, "aMazeing");
		
		scar = new Scanner(System.in);
		int mazeNr = scar.nextInt();
		
		mufasa = new Maze(mazeNr);
		
		mufasa.draw(botadeJesusAndraDjurOckså);
		
		turtleeee = new Turtle(botadeJesusAndraDjurOckså, mufasa.getXEntry(), mufasa.getYEntry());
		
		MazeRunner runner = new MazeRunner(turtleeee, mazeNr);
		
		runner.walk(mufasa, botadeJesusAndraDjurOckså);
		
		}
	}
	
	

}
