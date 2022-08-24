
public class Ocean3 {
	String name; //name of the ocean
	long area; //area of the ocean km2
	long volume; //volume of the ocean km3
	int maxDepth; //depth of the ocean m
	
	public Ocean3(String n, long a, long v, int d) {
		super();
		this.name = n;
		this.area = a;
		this.volume = v;
		this.maxDepth = d;
	}

	double getAverageDepth(){
		double averageDepth = this.volume / this.area;
		return averageDepth;
	}
	
	public String toString() {
		String s = this.name + ": ( " + this.area + " km2, " +  this.volume + " km3, " + this.maxDepth + "m)";
		return s;
	}

}
