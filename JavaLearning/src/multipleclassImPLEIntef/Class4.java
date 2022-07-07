package multipleclassImPLEIntef;

import multipleInherit.InteTestClass;
import multipleInherit.Interface1;

public class Class4 extends Class3 {
	
	int AAclass4=4;
	
	@Override
	public void AAmethod1()
	{
		System.out.println("method1Class4");
	}

	@Override
	public void AAmethod2() {
		System.out.println("method2Class4");
		
	}

	@Override
	public void AAmethod3() {
		System.out.println("method2Class4");
	
		Interface1 b=new InteTestClass();
		b.interface1method1();
	}
	
	public void AAmethodclass3() {
		System.out.println("onlymethodClass4");
	
	
	}

}
