package overiding;

public class TestClass  {
	
	public static void main (String args[])
	{
		GrandChild c=new GrandChild();
		c.interRate(100, 100);
		
		
		
		ChildClass c1=new GrandChild();
		c1.interRate(100, 100);
		
		
		
		ParentClass c2=new GrandChild();
		c2.interRate(100, 100);
		
		
	}

}
