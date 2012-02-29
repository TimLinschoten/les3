package Salaries;
public class JuniorEmployee extends Employee 
{
	public JuniorEmployee(String name, double salary) {
		super(name, salary);
	}
	
	public String toString() {

		return "Junior " + super.toString();
	}
	
	public void raisePay()
	{
		this.setSalary(this.getPay() * 105 + 10000);
		this.setSalary(this.getPay() / 100);		
	}
}
