package collections;

import java.util.*; 

public class Listclass { 
 

	private static int size;
	private static Object clone;

	public static void main(String[] args) 
    { 
        // Creating a list 
		List<String> namelist = new ArrayList<String>(); 
        
        namelist.add("Karthi");
        namelist.add("sathish");
        namelist.add("priyanka");
        namelist.add("vijay");
        namelist.add("pavithra");
        namelist.add("Karthi");
        
        
       System.out.println(namelist);
       

       LinkedList<String> namelist2 = new LinkedList<String>(); 
       
		
		  namelist2.add("ann anty"); 
		  namelist2.add("suresh");
		  namelist2.add("saravana");
		 
              
       //to insert the object at specified index
       namelist.add(1, "testname");
       System.out.println(namelist);
       
       // to insert a collection
     //  namelist.addAll(namelist2);
      // System.out.println(namelist);
       
       // to insert collection from index // but not behaving
       namelist.addAll(namelist2);
             System.out.println(namelist);
       
       // to get index of element
       String s = namelist.get(3);
       System.out.println(s);
       
        //lastindex of element
       System.out.println(namelist.lastIndexOf("sathish"));
       System.out.println(namelist.lastIndexOf("karthikeyan"));
       
       //remove element
       namelist.remove("Karthikeyan"); 
       System.out.println(namelist);
       
       //replace the elemt in specified index
       namelist.set(3, "abdul");
       System.out.println(namelist);
       
       
       //sublist
       List<String> subList = namelist.subList(1, 2);
       System.out.println(subList);
       
       //namelist.clear();
       System.out.println(namelist);
       
       
              System.out.println(clone);
       
       
       
       
       
  
        
    } 
} 