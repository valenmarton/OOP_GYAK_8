package running;

import geometric.Cubold;
import geometric.Cylinder;
import geometric.Prism;

public class Main2 {
	public static void main(String[] args) {
		
		PrismData data = new PrismData(5);
		Prism cubold = new Cubold(4,2,3);
		
		Prism cylinder = new geometric.Cylinder(4,6);
		Cylinder cylinder1 = new Cylinder (4,3);
		
		data.setPrism(0, cubold);
		data.setPrism(2, cylinder);
		data.setPrism(4, cylinder1);
		
		for(int i = 0; i < data.getNumberOfPrism(); i++) {
			System.out.println(data.getPrismIndex(i));
		}
		System.out.println(data.getAverageVolume());
		System.out.println(data.getNumberOfCylinder());
	}
}
