public class Class {
	public static void main(String[] args) {

		Student myStudent = new Student();
		myStudent.firstName = "Jimmy";
		myStudent.lastName = "John";
		myStudent.major = "Math";
		myStudent.gpa = 3.4;
		myStudent.age = 26;
		myStudent.onProbation = false;


		Student myStudent2 = new Student();
		myStudent2.firstName = "Stan";
		myStudent2.lastName = "Ducky";
		myStudent2.major = "Communication";
		myStudent2.gpa = 2.7;
		myStudent2.age = 23;
		myStudent2.onProbation = false;

	
		System.out.println(myStudent2.firstName);
	}

}