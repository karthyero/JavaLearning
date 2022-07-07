package multipleclassImPLEIntef;

import multipleInherit.Interface1;

public class Class1 implements MainInterface{
	
	
	MainInterface n=new MainInterface() {
		
		@Override
		public void AAmethod3() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void AAmethod2() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void AAmethod1() {
			// TODO Auto-generated method stub
			
		}
	};
	@Override
	
	public void AAmethod1()
	{
		System.out.println("method1Class1");
	}

	@Override
	public void AAmethod2() {
		System.out.println("method2Class1");
		
	}

	@Override
	public void AAmethod3() {
		System.out.println("method2Class1");
		
	}

}
