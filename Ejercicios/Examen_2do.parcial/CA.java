public class CA {
	
	private int x;
	private int y ;

	public CA(int x_p, int y_p) {
		this.x = x_p;
		this.y = y_p;
	}

	public void setX(int x_p) {
		this.x = x_p;
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y_p) {
		this.y = y_p;
	}

	public int getY() {
		return this.y;
	}

	public int sumar() {
		return x + y;
	}
}