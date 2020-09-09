package Assignment_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 employee1=new Employee1();
		employee1.employeeid1=1;
		employee1.employeename="Ameesha";
		employee1.employeesalary=30000;
		employee1.display1();
		
		// employee2 datails

		Employee2 employee2=new Employee2();
		employee2.employeeid2=2;
		employee2.employeename2="js";
		employee2.employeesalary2=20000;
		employee2.display2();
		
		// difference of salary
		System.out.println("Difference of there salaries"+(employee1.employeesalary-employee2.employeesalary2));
		
		//highest salary
		if (employee1.employeesalary>employee2.employeesalary2) {
			int emp=employee1.employeesalary-employee2.employeesalary2;
			System.out.println(" Employee1 has highest salary"+emp);
		}
		else
		{
			int emp1=employee1.employeesalary-employee2.employeesalary2;
			
			System.out.println("employee 2 has highest salary"+emp1);
		}

		// updating employee1 name
		if(employee1.employeename=="Ameesha" )
		{
			employee1.employeename="Ameesha saxena";
			System.out.println(" updated name ==="+employee1.employeename );
		}
	}

}
