package kodlamaIoOOP;

public class StudentManager extends UserManager{
	public void subscribeToLesson(Lesson lesson, User user) {
		System.out.println(user.getFirstName()+ lesson.getLessonName()+ " Dersine Kay�t Olundu");
	}
	public void unsubscribeToLesson(Lesson lesson, User user) {
		System.out.println(user.getFirstName()+ lesson.getLessonName()+ " Dersinden Kay�t silindi");
	}

}
