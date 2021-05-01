package kodlamaIoOOP;

public class Student extends User  {	
	
	public Student(String nickName,String firstName) {
		super(firstName);
		this.nickName = nickName;
		System.out.println("Student intance'ý oluþtu");
	}
	
	Lesson[] lessons;
	String nickName;
	String email;
	String Password;
	
	public Lesson[] getLessons() {
		return lessons;
	}
	public void setLessons(Lesson[] lessons) {
		this.lessons = lessons;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
