package polymorphism;

public class TestClass {
	
	public void m1()
	{
		System.out.println("No Paramenter");
		
	}
	public int m1(int a) {
		
		System.out.println("int method");
		return a;
		
	
	}
	public float m1(float a) {
		
		System.out.println("Float");
		return a;
		
	}
	public static void main(String args[])
	{
		TestClass t=new TestClass();
		t.m1();
		t.m1(20l);
		t.m1(10f);
		
	}
	
	
	
	

}
