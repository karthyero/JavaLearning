package polymorphism;

public class TestObjec {
	
	
	  public Object m1(Object o) {
	  
	  System.out.println("Object meth"); return o;
	  
	  }
	 
	
		/*
		 * public String m1(String a) {
		 * 
		 * System.out.println("String method"); return a;
		 * 
		 * }
		 */
	 
	
	
	public static void main(String[] args) {
		
		TestObjec t=new TestObjec();
		t.m1("String");
		t.m1(new Object());

	}

}
