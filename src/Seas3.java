
public class Seas3 {

	//	Ocean		  Area(km2)		Volume (km3)	MaxDepth (m)
	// Arctic: 		 15,558,000; 	 18,750,000; 	 5,567;
	// Atlantic:   	 85,133,000; 	310,410,900; 	 8,486;
	// Indian:   	 70,560,000; 	264,000,000;  	 7,906;
	// Pacific:  	161,760,000; 	660,000,000; 	10,803;

	public static void main(String[] args) {
		// create an Ocean object and store its reference to the variable pacific
		Ocean ocean = new Ocean();
		// Printing the pacific object java reference
		System.out.println("Ocean object created! Reference = " + ocean);

		// Assigning values to attributes
		ocean.name 		= "pacific";
		ocean.area 		= 161760000;
		ocean.volume	= 660000000;
		ocean.maxDepth 	= 10803;
		
		
		//calling method getAverageDepth() from object 
		double avg_depth = ocean.getAverageDepth() * 1000; //m
		System.out.println("Average depth = " + avg_depth + " m");
	}

}
