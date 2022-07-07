package inherit;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Case1 cannot call child class method using parent  class reference
		
		ClassP p1=new ClassP();
		p1.classAMethod1();  //child class method won't come
		
		
//Case2 can call both Pclass and Cclass method from child ref
		
		ClassC C1=new ClassC();
		C1.classAMethod1();
		C1.classCMethod1();
//Case3 PClass can hold child class object but we cannot call child method using that
		
		ClassP p2=new ClassC();
		p2.classAMethod1();//can call par Class met
	//	p2.classCMethod1(); // but will get error on accessing child class method
		
//Case4 Child reference cannot hold parent class object
		
	//	ClassC c1=new ClassP(); // we will get error
		
//Object class is the base for all class in java		
		Object s=new String("Test");
		//Throwable
		
		
	}

}
