package employee;

import java.util.ArrayList;

public class DisplayAllEmployee {

	public void displayAllEmployee(ArrayList<Employee> list)
	{
	
	  
	        for (int i = 0; i < list.size(); i++) 
	        { 
	            
	            Employee e= list.get(i); 
	  
	           System.out.println(e.toString());
	           // System.out.println(e.id+" "+e.name+" "
	                //               +e.department+" "+e.designation); 
	        } 
	     
	}
}
