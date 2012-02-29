package Salaries;

public class EmployeeFactory 
{
	public static Employee createEmployee(EmployeeType type, String name, double salary)
	{
		Employee retVal = null;
		switch (type)
		{
			case Junior: retVal = new JuniorEmployee(name, salary); break;
			case Medior: retVal = new MediorEmployee(name, salary); break;
			case Senior: retVal = new SeniorEmployee(name, salary); break;
		}
		
		return retVal;
	}
}
