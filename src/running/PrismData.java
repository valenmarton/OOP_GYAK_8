package running;
import geometric.Cylinder;
import geometric.Prism;

public class PrismData {
	Prism[] prismArray;
	
	public PrismData( int numberOfElements) {
		prismArray = new Prism[numberOfElements];
	}
	public int getNumberOfPrism() {
		return prismArray.length;
	}
	
	public void setPrism(int index, Prism prism) {
		prismArray[index] = prism;
	}
	public Prism[] getPrismArray() {
		return prismArray;
	}
	
	public Prism getPrismIndex(int index) {
		return prismArray[index];
	}
	public int getNumberOfNulls() {
		int counter=0;
		for (Prism prism : prismArray) {
			if(prism != null) {
				counter++;
			}
		}
		return counter;
	}
	public double getAverageVolume() {
		double average = 0;
		for (Prism prism : prismArray) {
			if(prism!=null) {
				average += prism.getVolume();
			}
		}
		return average/getNumberOfNulls();
	}
	public int getNumberOfCylinder() {
		int counter = 0;
		for (Prism prism : prismArray) {
			if(prism instanceof Cylinder) {
				counter ++;
			}
		}
		return counter;
	}
}
