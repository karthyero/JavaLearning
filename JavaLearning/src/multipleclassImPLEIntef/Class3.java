package multipleclassImPLEIntef;

import multipleInherit.InteTestClass;
import multipleInherit.Interface1;

public class Class3 extends Class2{
	
	int AAclass4=3;
	
	@Override
	public void AAmethod1()
	{
		System.out.println("method1Class3");
	}

	@Override
	public void AAmethod2() {
		System.out.println("method2Class3");
		
	}

	@Override
	public void AAmethod3() {
		System.out.println("method2Class3");
	
		Interface1 b=new InteTestClass();
		b.interface1method1();
	}
	public void AAmethodclass3() {
		System.out.println("onlymethodClass3");
	
	
	}
	

}
