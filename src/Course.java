
public class Course {

	public static void main(String[] args) {
		//declare a variable to hold a student reference
		Student s1 = null;
		if(s1 == null) {
			System.out.println("Reference held in s1: " + s1);
		}
		//create a new student
		 s1 = new Student();
		
		//print the reference to the newly created instance
		System.out.println("Reference to the new student object: " + s1);

	}

}
