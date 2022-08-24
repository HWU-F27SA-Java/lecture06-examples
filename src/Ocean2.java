
public class Ocean2 {
	String name; //name of the ocean
	long area; //area of the ocean
	long volume; //volume of the ocean
	int maxDepth; //depth of the ocean
	
	public Ocean2(String n, long a, long v, int d) {
		this.name = n;
		this.area = a;
		this.volume = v;
		this.maxDepth = d;
	}


	double getAverageDepth(){
		double averageDepth = this.volume / this.area;
		return averageDepth;
	}

}
