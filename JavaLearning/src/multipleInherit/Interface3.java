package multipleInherit;

public interface Interface3 extends Interface1,Interface2 {
	

	default void interface3defmethod1() {
		System.out.println("Default interface method");
		
	}
	
	
	String interface3method1();  
	//String test(); as 


	@Override
	default void defmet() {
		// TODO Auto-generated method stub
		Interface1.super.defmet();
	}

	/*
	 * @Override //we can implement the default method here to avoid ambugity or
	 * else use public default void defmet() { System.out.println("overide defmet");
	 * }
	 */

}
