package kodlamaIoOOP;

public class Instructor  extends User {
	public Instructor(String branch,String firstName) {
		super(firstName);
		this.branch = branch;
		System.out.println("Instructor instance'ý oluþtu.");
	}
	
	Lesson[] lessons;
	String branch;
	public Lesson[] getLessons() {
		return lessons;
	}
	public void setLessons(Lesson[] lessons) {
		this.lessons = lessons;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
