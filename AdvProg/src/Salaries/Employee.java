package Salaries;
public abstract class Employee 
{
	protected String name;
	protected double salary;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}	
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public double getPay() {
		return salary;
	}	

	public String toString()
	{
		return "employee " + name + " has salary " + salary;
	}
	
	public abstract void raisePay();
}

