package Salaries;
import java.util.ArrayList;
import java.util.Iterator;


public class SalarySystem implements Iterable<Employee>
{
	private ArrayList<Employee> employees;
	
	public SalarySystem() 
	{
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee c) {
		employees.add(c);
	}
	
	public Employee searchEmployee(String s) throws EmployeeNotFoundException
	{
		for (Object e : employees) 
		{
			Employee employee = (Employee)e;
			String name = employee.getName();
			
			if (name.equals(s))
				return employee;
		}
		
		throw new EmployeeNotFoundException("Employee not found");
	}
	
	public String toString()
	{
		StringBuilder retVal = new StringBuilder();
		for (Object obj : employees) {
			Employee e = (Employee)obj;
			retVal.append(e.toString());
			retVal.append("\n");
		}
		
		return retVal.toString();
	}

	@Override
	public Iterator<Employee> iterator() {
		return employees.iterator();
	}
}


