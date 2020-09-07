package employee;

import java.util.ArrayList;

public class DeleteEmployee {
	public void deleteEmployee(ArrayList<Employee> list,String id) {
		for(Employee e:list)
		{
			
			if(id.equals(e.getId()))
			{
				list.remove(e);
				System.out.println("employee with "+id+"deleted");
			}
			else
			{
				System.out.println("record is not present");
			}
		}
		
	}

}
