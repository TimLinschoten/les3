package Salaries;

public class MediorEmployee extends Employee 
{
	public MediorEmployee(String name, double salary) {
		super(name, salary);
	}
	
	public String toString() {

		return "Medior " + super.toString();
	}
	
	public void raisePay()
	{
		this.setSalary(this.getPay() * 106 + 20000);
		this.setSalary(this.getPay() / 100);		
	}
}
