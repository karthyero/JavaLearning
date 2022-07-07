package inheritance2learing;

public class Car extends Vehicle{
	@Override
	public void engine()
	{
		System.out.println("car engine from Auto");
	}
	
	public void steer()
	{
		System.out.println("car steering");
	}

	public void brake()
	{
		System.out.println("car brake");
	}
}
