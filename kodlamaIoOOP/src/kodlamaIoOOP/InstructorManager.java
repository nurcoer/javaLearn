package kodlamaIoOOP;

public class InstructorManager extends UserManager{
	public void addLesson(Lesson lesson) {
		System.out.println(lesson.getLessonName()+" dersini eklendiniz.");
	}
	public void removeLesson(Lesson lesson) {
		System.out.println(lesson.getLessonName()+ "dersini silindiniz.");
	}
}
