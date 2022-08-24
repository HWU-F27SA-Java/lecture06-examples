
public class Ocean {
	String name; //name of the ocean
	long area; //area of the ocean
	long volume; //volume of the ocean
	int maxDepth; //depth of the ocean
	
	double getAverageDepth(){
		double averageDepth = this.volume / this.area;
		return averageDepth;
	}

}
