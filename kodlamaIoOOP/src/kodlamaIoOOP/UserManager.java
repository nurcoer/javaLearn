package kodlamaIoOOP;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" Ki�isi eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+" Ki�isi G�ncellendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" Ki�isi Silindi");
	}
}
