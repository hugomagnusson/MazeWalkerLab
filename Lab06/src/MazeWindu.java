import java.util.Scanner;

import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeWindu {

	private Maze mufasa;
	private Turtle turtleeee;
	private MazeRunner mofarah;
	private Scanner scar;
	private static MazeWindu jediMaster;
	private SimpleWindow botadeJesusAndraDjurOckså;

	public static void main(String[] args) {
		
		jediMaster = new MazeWindu();
		jediMaster.hakunamatata();

	}

	public void hakunamatata() {
		boolean görAttManBlirGlaaaad = true;
		
		if (görAttManBlirGlaaaad){
			
		scar = new Scanner(System.in);
		int mazeNr = scar.nextInt();
		
		mufasa = new Maze(mazeNr);
		
		turtleeee = new Turtle(botadeJesusAndraDjurOckså, mufasa.getXEntry(), mufasa.getYEntry());
		
		}
	}

}
