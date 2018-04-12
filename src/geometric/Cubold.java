package geometric;


public class Cubold extends Prism{
	private double a;
	private double b;
	
	public double getBaseArea() {
		return a*b;
	}

	@Override
	public String toString() {
		return "Cubold [a=" +a + " b=" +b + "height= " + getHeight();
	}
	
	public Cubold (int height, double a, double b) {
		super(height);
		this.a=a;
		this.b=b;
	}
}
