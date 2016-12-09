package Game;

import Game.Connect_Four.Connect_Four_Grid;

public class Main {

	public static void main(String[] args) {
		Connect_Four_Grid g = new Connect_Four_Grid();
		g.addToColom(0, "x");
		g.addToColom(0, "y");
		
		System.out.println(g.getElement(0, 0));
		System.out.println(g.getElement(0, 1));
		System.out.println(g.getElement(0, 2));
		System.out.println(g.getElement(0, 3));
		System.out.println(g.getElement(0, 4));
		System.out.println(g.getElement(0, 5));
		System.out.println(g.getElement(0, 6));
		System.out.println(g.getElement(0, 7));
	}

}
