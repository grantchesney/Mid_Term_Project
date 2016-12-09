package Game.Connect_Four;

import Game.Grid;

public class Connect_Four_Grid extends Grid {

	public void addToColom(int column, String player) {

		for (int i = 0; i < this.getHeight(); i++) {
			if (this.getElement(column, i) == null) {
				this.addElement(column, i, player);
				break;
			}
		}

	}

}
