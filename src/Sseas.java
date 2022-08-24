
public class Sseas {

	public static void main(String[] args) {
		// call static attributes and methods for SOcean class
		SOcean.name = "Pacific";
		SOcean.area = 10000000;
		SOcean.volume = 500000000;

		// Printing the pacific object java reference
		System.out.println("Ocean: " + SOcean.name);

		double depth = SOcean.getAverageDepth();
		// Printing depth
		System.out.println("Depth: " + depth);

	}

}
