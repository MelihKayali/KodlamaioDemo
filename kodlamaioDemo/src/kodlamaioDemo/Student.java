package kodlamaioDemo;

public class Student extends User{
	private String school;

	public Student(int id, String firstName, String lastName, String eMail, String school) {
		super(id, firstName, lastName, eMail);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	

}
