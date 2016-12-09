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

	@Override
	public void addElement(int x, int y, String s) {
		this.grid[x][y] = s;
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
	public String getElement(int x, int y) {
		return grid[x][y];
	}

}
