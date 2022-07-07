package inheritance2learing;

public class Audi extends Car{
	
	@Override
	public void steer() {
		System.out.println("Audi car steering");
	}
	@Override
	public void brake() {
		System.out.println("Audi car brake");
	}
	
	public void Audisafety() {
		System.out.println("Audi car safety");
	}

}
