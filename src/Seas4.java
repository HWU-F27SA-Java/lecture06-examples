
	//	Ocean		  Area(km2)		Volume (km3)	MaxDepth (m)
	// Arctic: 		 15,558,000; 	 18,750,000; 	 5,567;
	// Atlantic:   	 85,133,000; 	310,410,900; 	 8,486;
	// Indian:   	 70,560,000; 	264,000,000;  	 7,906;
	// Pacific:  	161,760,000; 	660,000,000; 	10,803;

public class Seas4 {
	public static void main(String[] args) {
		// create an Ocean object using constructor
		Ocean2 ocean = new Ocean2("pacific", 161760000, 660000000, 10803);
		// Printing the pacific object java reference
		System.out.println("Ocean object created! Reference = " + ocean);

		// Printing  attributes 
		System.out.println("Ocean\t= " 	+ ocean.name);
		System.out.println("Area\t= " 		+ ocean.area+ " Km2");
		System.out.println("Volume\t= " 	+ ocean.volume+ " Km3");
		System.out.println("Max depth\t= " + ocean.maxDepth+ " m");
		
		//calling method getAverageDepth() from object 
		double avg_depth = ocean.getAverageDepth() * 1000; //m
		System.out.println("Average depth = " + avg_depth + " m");
	}
}
