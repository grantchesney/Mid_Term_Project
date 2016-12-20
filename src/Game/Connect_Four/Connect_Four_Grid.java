package Game.Connect_Four;

import Game.Grid;

public class Connect_Four_Grid extends Grid {
	
	public Connect_Four_Grid(int height, int width) {
		super(height, width);
	}

	public void addToColom(int column, String player) {

		for (int i = 0; i < this.getHeight(); i++) {
			if (this.getElement(i, column) == null) {
				this.addElement(i, column, player);
				break;
			}
		}

	}

	public boolean isColomFull (int column) {
		int count = 0;
		for(int i = 0; i < this.getHeight(); i ++) {
			if(this.getElement(i, column) != null) {
				count ++;
			}
		}

		if (count == getHeight()) {
			return true;
		}
		return false;
	}

}
