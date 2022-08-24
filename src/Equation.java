
public class Equation {
	double a, b, c; //coefficients of the equation ax2 + bx + c = 0
	
	/*
	 * this method takes the coefficients a, b , c as input and calculates the roots
	 * of the equation ax2+bx+c=0
	 * 
	 * It first process the degenerate cases where one or many coefficients are 0
	 * 
	 * Then calculates the determinant and check its sign
	 * 
	 * When the determinant is negative, there are no roots When the determinant is
	 * 0, there one root When the determinant is positive, the are two roots
	 * 
	 * The method stores the roots in the variables x1 and x2 and the number of
	 * roots in the variable numberOfRoots
	 */
	Root solve() {
		Root root = new Root();

		// First, process the degenerate cases
		if (a == 0 && b == 0 && c == 0) { // 0 = 0; all real numbers are roots!
			root.numberOfRoots = 3;
			return root;
		}
		if (a == 0 && b == 0 && c != 0) { // c = 0; no root
			root.numberOfRoots = 0;
			return root;
		}
		if (c == 0) { // ax2 + bx = 0; 0 is the only root
			root.numberOfRoots = 1;
			root.x1 = root.x2 = 0;
			return root;
		}
		if (a == 0) { // bx + c = 0; -c/b is root
			root.numberOfRoots = 1;
			root.x1 = root.x2 = -c / b;
			return root;
		}

		// the equation is regular (not degenerate
		// calculate the determinant
		double delta = b * b - 4 * a * c;

		if (delta < 0) { // no real roots
			root.numberOfRoots = 0;
			return root;
		}

		if (delta == 0) {// one double root
			root.numberOfRoots = 1;
			root.x1 = -b / (2 * a);
			root.x2 = root.x1 ;
			return root;

		}

		// standard case with two roots
		root.numberOfRoots = 2;
		root.x1 = (-b - Math.sqrt(delta)) / (2 * a);
		root.x2 = (-b + Math.sqrt(delta)) / (2 * a);
		return root;

	}
}
