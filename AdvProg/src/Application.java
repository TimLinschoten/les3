import Salaries.*;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		SalarySystem s = new SalarySystem();
		s.addEmployee(EmployeeFactory.createEmployee(EmployeeType.Junior, "Jaap", 1700));
		s.addEmployee(EmployeeFactory.createEmployee(EmployeeType.Medior, "Fred", 2000));
		s.addEmployee(EmployeeFactory.createEmployee(EmployeeType.Senior, "Hans", 2300));
		
		System.out.println(s.toString());

		for (Object obj : s)
		{
			Employee emp = (Employee)obj;
			emp.raisePay();
		}
		
		System.out.println(s.toString());		
	}
}
