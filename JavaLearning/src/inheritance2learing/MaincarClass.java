package inheritance2learing;

public class MaincarClass {

	
	public static void main(String args[])
	{
		
		BMW b=new BMW();
		b.engine();
		
		
		
		System.out.println("------------------------------");
		//compile time since it directly takes the method from BMW class even it is overiding method
		b.engine();
		b.engine();
		
		Audi a=new Audi();
		a.steer();
		a.Audisafety();
		a.engine();
		System.out.println("-------");
		
		Car c=new BMW();
		System.out.println("car datatypr");
		c.steer();//dynamic or late or runtime polymorphism
		c.engine();
		
		System.out.println("-------");
		Vehicle v=new Vehicle();
		v.engine();
		
		
		System.out.println("-------");
		AutiInterf bn=new Vehicle();
		bn.engine();
		
	}
}
