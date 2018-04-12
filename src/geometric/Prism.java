package geometric;

//abstract osztályt nem tudunk példányosítani
public abstract class Prism {
private int height;
	
	public Prism(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public abstract double getBaseArea();
	public double getVolume() {
		return height * getBaseArea();
	}
	
	public boolean hasGreaterVolumeThan(Prism prism) {
		if(this.getVolume()>prism.getVolume());
		return true;
	}
}
