package employeedto;

public class EmployeeDto {
	private String name;
	private String date;
	private double salary;
	public EmployeeDto() {
		super();
	}
	public EmployeeDto(String name,String date,double salary) {
		this.name=name;
		this.date=date;
		this.salary=salary;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public double getSalary() {
		return salary;
	}
	

}
