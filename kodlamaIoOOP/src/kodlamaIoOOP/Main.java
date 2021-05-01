package kodlamaIoOOP;


public class Main {

	public static void main(String[] args) {
		//----Create 
		Student student= new Student("Sedna","Nur");
		Instructor instructor = new Instructor("Java","Fatih");
		Lesson lesson=new Lesson("Kaliteli yazılım Geliştirme");
		
		
		//studentOperations
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.subscribeToLesson(lesson,student);
		studentManager.unsubscribeToLesson(lesson,student);
		studentManager.delete(student);
		
		//instructorOperations
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.addLesson(lesson);
		instructorManager.removeLesson(lesson);
		instructorManager.delete(instructor);
	}

}
