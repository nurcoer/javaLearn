package kodlamaIoOOP;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" Kiþisi eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+" Kiþisi Güncellendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" Kiþisi Silindi");
	}
}
