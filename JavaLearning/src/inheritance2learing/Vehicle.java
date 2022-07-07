package inheritance2learing;

public class Vehicle extends Automobile{
	
	public void m1vehicle()
	{
		System.out.println("Vehicle method");
	}
	@Override
	public void engine()
	{
		System.out.println("vehicle engine from Auto");
	}

}
