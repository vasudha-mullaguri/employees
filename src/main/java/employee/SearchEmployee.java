package employee;

import java.util.ArrayList;

public class SearchEmployee {
	
	
	public void searchEmployee(ArrayList<Employee> list,String id)
	{
	
		for(Employee e:list)
		{
			if(id.equals(e.getId()))
			{
				System.out.println(e.toString());
			}
			else
			{
				System.out.println("record is not present");
			}
		}
	}

}
