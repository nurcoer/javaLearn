import eCommerce.Business.Concrete.UserManager;
import eCommerce.Core.Concrete.EmailNotification;
import eCommerce.Core.Concrete.GoogleAccountManager;
import eCommerce.DataAccess.Concrete.HibernateUserDao;
import eCommerce.Entities.Concrete.User;
import eCommerce.Entities.Dtos.LoginUser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User nur = new User(1,"nur","cöer","kadriyecoer@gmail.com","123456");
		
		UserManager userManager=new UserManager(new HibernateUserDao(),new GoogleAccountManager(),new EmailNotification());
		System.out.println("------------------------Kullanýcý Kayýt----------------------");
		userManager.signUp(nur);
		
		System.out.println("------------------------Kullanýcý Giriþ----------------------");
		LoginUser loginUser = new LoginUser(nur.geteMail(),nur.getPassword());
		userManager.signIn(loginUser);
	}

}
