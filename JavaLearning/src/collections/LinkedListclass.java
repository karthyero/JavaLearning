package collections;

import java.util.*; 

public class LinkedListclass { 
 

	private static int size;
	private static Object clone;

	public static void main(String[] args) 
    { 
        // Creating a list 
		

       LinkedList<String> namelist2 = new LinkedList<>(); 
       ArrayList<String> namelist1 = new ArrayList<>(); 
		
		  namelist2.add("KArthi");
		  namelist2.add("sathish");
		  System.out.println(namelist2);
		  namelist2.addFirst("vijay");
		  namelist2.addFirst("priya");
		  namelist2.addLast("priyanka");
		  System.out.println(namelist2);
	
    
       
       
  
        
    } 
} 