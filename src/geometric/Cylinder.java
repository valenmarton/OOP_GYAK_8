package geometric;


public class Cylinder extends Prism{
	private double radius;
	
	public Cylinder (int height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double getBaseArea() {
		return radius*radius*Math.PI;
	}
	
	@Override
	public String toString() {
		return "Cylinder [radius=" + radius +", toString() =" + super.toString();
	}
	
	
}