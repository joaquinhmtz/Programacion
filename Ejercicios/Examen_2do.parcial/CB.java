public class CB extends CA {
	
	private int z;

	public CB(int x, int y, int z_p) {
		super(x, y);
		this.z = z_p;
	}

	public void setZ(int z_p) {
		this.z = z_p;
	}

	public int getZ() {
		return this.z;
	}

	public int sumar() {
		return super.sumar() + z;
	}

}