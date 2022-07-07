package multipleInherit;

public interface Interface2 {
	
	void interface2method1();
	int interface2method2();
	default void defmet() { //default method in interface2
		System.out.println("def inter2");
	}

}
