package kodlamaioDemo;

public class Instructor extends User {
	private String salary;
	private String license;
	public Instructor(int id, String firstName, String lastName, String eMail, String salary, String license) {
		super(id, firstName, lastName, eMail);
		this.salary = salary;
		this.license = license;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
	
}
