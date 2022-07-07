package multipleclassImPLEIntef;

import multipleInherit.InteTestClass;
import multipleInherit.Interface1;

public class Class5 extends Class4{
	
	int AAclass4=5;
	
	@Override
	public void AAmethod1()
	{
		System.out.println("method1Class5");
	}

	@Override
	public void AAmethod2() {
		System.out.println("method2Class5");
		
	}

	@Override
	public void AAmethod3() {
		System.out.println("method2Class5");
	
		Interface1 b=new InteTestClass();
		b.interface1method1();
	}

	public void AAmethodclass5() {
		System.out.println("onlymethodClass5");
	
	
	}
	@Override
	public void AAmethodclass3() {
		// TODO Auto-generated method stub
	Class3 s=new Class3();
	s.AAmethodclass3();
			
	}
}
