package kodlamaIoOOP;

public class StudentManager extends UserManager{
	public void subscribeToLesson(Lesson lesson, User user) {
		System.out.println(user.getFirstName()+ lesson.getLessonName()+ " Dersine Kayýt Olundu");
	}
	public void unsubscribeToLesson(Lesson lesson, User user) {
		System.out.println(user.getFirstName()+ lesson.getLessonName()+ " Dersinden Kayýt silindi");
	}

}
