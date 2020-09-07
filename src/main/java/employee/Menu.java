package employee;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
	
	public void menu() {
	int exponent;
	Scanner input=new Scanner(System.in);
	ArrayList<Employee> list=new ArrayList<Employee>(); 
	{
		do {
		try {
		
		System.out.println("enter your choice \n 1.Add \n 2.Search \n 3.delete \n 4.display");
		int option=input.nextInt();
		switch (option)
		{
		case 1:
		      AddEmployee a=new AddEmployee();
		      System.out.println("enter name");
		      String name=input.next();
		      System.out.println("enter id");
		      int id=input.nextInt();
		      System.out.println("enter department");
		      String department=input.next();
		      System.out.println("enter designation");
		      String designation=input.next();
		      a.addEmployee(list,id, name, department, designation);
	          break;
		case 2:
			SearchEmployee s=new SearchEmployee();
			System.out.println("enter employee id to get details");
			String id1=input.next();
			 s.searchEmployee(list,id1);
	          break;
		case 3:
			DeleteEmployee d=new DeleteEmployee();
			System.out.println("enter employee id to delete");
			String id2=input.next();
			d.deleteEmployee(list,id2);
	          break;  
		case 4:
			DisplayAllEmployee de=new DisplayAllEmployee();
			de.displayAllEmployee(list);
			break;
		
		}
		}
		catch(Exception e) {
			System.out.println("Invalid Choice,try again");
		}
		finally {
		System.out.println("Do you want to continue? 1.yes 2.No");
		 exponent=input.nextInt();
		}}
	while(exponent==1);

}

}
}