package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Melih", "KAYALI", "qweqwe@gmail.com", "asd");
		Student student2 = new Student(2,"Sezer" , "TETÝK" , "sadas@gmail.com" , "wqe");
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.add(student2);
		studentmanager.add(student1);
		
		System.out.println("----------------------");
		
		Instructor instractor1 = new Instructor(10, "Engin", "DEMÝROÐ", "asdf@gmail.com", "10250", "(MCT) ,PMP ve ITIL");
		Instructor instructor2 = new Instructor(15 , "Birkan" , "KOZ" , "asd@gmail.com" , "9500" , "(MCT) ,PMP");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor2);
		instructorManager.add(instractor1);
	}

}
