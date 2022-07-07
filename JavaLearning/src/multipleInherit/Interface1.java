package multipleInherit;

public interface Interface1 {
	
	int a=10;
	void interface1method1();
	int interface1method2();
	
	default void defmet() { //default method in interface1
		System.out.println("def inter1");
	}

}
