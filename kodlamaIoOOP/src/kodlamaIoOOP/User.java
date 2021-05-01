package kodlamaIoOOP;

public class User {
	
	public User(String firstName) {
		this.firstName = firstName;
		System.out.println("User intance'ý oluþtu");
	}
	public User () {
		System.out.println("User intance'ý oluþtu");
	}
	
	private String firstName;
	private String lastName;
	private String description;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

}
