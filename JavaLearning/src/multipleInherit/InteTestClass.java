package multipleInherit;

public class InteTestClass extends InterfaceAbstClass {

	public static void main(String[] args) {
		
		//InterfaceClass c=new InterfaceClass();
		//c.interface1method1();
		InteTestClass c=new InteTestClass();
		c.defmet();

	}

	@Override
	public String interface3method1() {
		System.out.println("interface3method1");
		return null;
	}

	@Override
	public int interface1method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void interface2method1() {
		System.out.println("interface3method1s");
		
	}

	@Override
	public int interface2method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void interface1method1() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
