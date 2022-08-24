
public class SOcean {
	static String name; //name of the ocean
	static long area; //area of the ocean
	static long volume; //volume of the ocean
	static int maxDepth; //depth of the ocean
	
	static double getAverageDepth(){
		double averageDepth = volume / area;
		return averageDepth;
	}

}
