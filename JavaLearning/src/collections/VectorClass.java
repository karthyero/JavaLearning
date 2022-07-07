package collections;

import java.util.*; 

public class VectorClass { 
 

	private static int size;
	private static Object clone;

	public static void main(String[] args) 
    { 
        // Creating a list 
		

       Vector<String> namelist2 = new Vector<>(10,3); 
       ArrayList<String> namelist1 = new ArrayList<>(); 
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
       namelist2.add("karthi");
		 int s= namelist2.size();
		  int s2=namelist2.capacity();
		  System.out.println(s);
		  namelist2.add("karthi");
		  namelist2.add("karthi");
		  namelist2.add("karthi");
		  System.out.println(s2);
		  int s3=namelist2.capacity();
		  int s4= namelist2.size();
		  System.out.println(s4);
		  System.out.println(s3);
		  namelist2.add("karthi");
		  namelist2.add("karthi");
		  namelist2.add("karthi");
		  namelist2.add("karthi");
		  int s5=namelist2.capacity();
		  System.out.println(s5);
	
    
       
       
  
        
    } 
} 