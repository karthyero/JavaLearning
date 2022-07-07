package multipleclassImPLEIntef;
import multipleInherit.InteTestClass;
import multipleInherit.Interface1;

public class Class2 implements MainInterface{
	
	int AAclass4=2;
	
	
	@Override
	public void AAmethod1()
	{
		System.out.println("method1Class2");
	}

	@Override
	public void AAmethod2() {
		System.out.println("method2Class2");
		
	}

	@Override
	public void AAmethod3() {
		System.out.println("method2Class2");
	
		Interface1 b=new InteTestClass();
		b.interface1method1();
	}
	
	public void AAmethodclass2() {
		System.out.println("onlymethodClass2");
	
	
	}
	
	
} 
