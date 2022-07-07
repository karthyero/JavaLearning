package constrctortest;

public class Student {

	String name;
	int roll;

	public Student() {
	roll=1;
	name = "Rekha";
		System.out.println("test");
		
	}
		
	
	

	/*
	 * void Const(){ //if we add return type it will treat as method
	 * System.out.println("Intialize"); Super(); }
	 */
	public static void main(String args[]) {

		Student c = new Student();
		Student c1 = new Student();
		// Student c2 = new Student();
		System.out.println(c.roll);
		System.out.println(c1.roll);
		

		System.out.println(c.name);
		System.out.println(c.roll);
		System.out.println(c1.name);
		System.out.println(c1.roll);

	}
}
