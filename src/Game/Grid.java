package Game;

public class Grid implements GridInterface {

	private int width;
	private int height;
	private String[][] grid;

	public Grid() {
		this.width = 8;
		this.height = 8;
		this.grid = new String[height][width];
	}

	public Grid(int height, int width) {
		this.width = width;
		this.height = height;
		this.grid = new String[height][width];
	}
	public void resetDB() {
		for(int i = 0; i < this.height; i++) {
			for(int a = 0; a < this.width; a++) {
				grid[i][a] = null;
			}
		}
	}

	@Override
	public void addElement(int y, int x, String s) {
		this.grid[y][x] = s;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public String getElement(int y, int x) {
		return grid[y][x];
	}

}
