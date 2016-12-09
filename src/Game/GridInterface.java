package Game;

public interface GridInterface {

	void addElement(int x, int y, String s);

	int getWidth();

	int getHeight();

	String getElement(int x, int y);

}
