package employee;

import java.util.ArrayList;

public class AddEmployee {
	
	public void addEmployee(ArrayList<Employee> list,int id,String name,String department,String designation)
	{
		 
     list.add(new Employee(id, name, department, 
                                   designation)); 
} 
	}
	
    
