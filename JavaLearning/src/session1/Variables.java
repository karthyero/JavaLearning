package session1;

public class Variables {
	
	int m1; //instance variable
	int m2;
	static int m4=30;
	static final int m5=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public class Varibles2
{
	
	public void method()
	{
		int m3=10; //local variable
		
		Variables v=new Variables();
		v.m1=10;
		v.m2=20;
		Variables.m4=60;
		
				
		
		
	
		
		System.out.println(v.m1);
		System.out.println(v.m2);
		System.out.println(m3);
		System.out.println(Variables.m4);//static variable
	}
	public void method2()
	{
		int m3=10; //local variable
		
		Variables v1=new Variables();
		v1.m1=30;
		v1.m2=40;
		m4=90; //If we access the static variable without the class name, Compiler will automatically append the class name.
		//m5=60; //staic final
		System.out.println(v1.m1);
		System.out.println(v1.m2);
		System.out.println(m3);
		
	}

}

}
