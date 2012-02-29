package Salaries;

public class EmployeeNotFoundException extends Exception {
	private static final long serialVersionUID = -1995494810945094551L;
	
	public EmployeeNotFoundException(String message)
	{
		super(message);
	}
}
