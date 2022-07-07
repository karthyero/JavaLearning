package inheritance2learing;

public class BMW extends Car {
	@Override
	public void steer() {
		System.out.println("BMW car steering");
	}

	@Override
	public void brake() {
		System.out.println("BMW car brake");
	}
	
	public void bmwsafety() {
		System.out.println("BMW car safety");
	}
	
	/*
	 * public void engine() { System.out.println("BMW engine from Auto"); }
	 */
}
