package Salaries;
public class SeniorEmployee extends Employee 
{
	public SeniorEmployee(String name, double salary) {
		super(name, salary);
	}
	
	public String toString() {

		return "Senior " + super.toString();
	}
	
	public void raisePay()
	{
		this.setSalary(this.getPay() * 107);
		this.setSalary(this.getPay() / 100);	
	}
}
