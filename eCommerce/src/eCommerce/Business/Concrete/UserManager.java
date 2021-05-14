package eCommerce.Business.Concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.Business.Abstract.UserService;
import eCommerce.Core.Abstract.AccountCheckService;
import eCommerce.Core.Abstract.UserNotificationService;
import eCommerce.DataAccess.Abstarct.UsersDao;
import eCommerce.Entities.Concrete.User;
import eCommerce.Entities.Dtos.LoginUser;

public class UserManager implements UserService{

	private UsersDao usersDao;
	private AccountCheckService accountService;
	private UserNotificationService UserNotifications;
	
	public UserManager(UsersDao usersDao,AccountCheckService  signType, UserNotificationService notificationType) {
		super();
		this.usersDao = usersDao;
		this.accountService=signType;
		this.UserNotifications=notificationType;
	}

	@Override
	public void signIn(LoginUser loginUser) {
		// TODO Auto-generated method stub
		boolean result = checkUserPasswordAndEmail(loginUser.geteMail(),loginUser.getPassword());
		result = usersDao.findEmail(loginUser.geteMail());
		result = handleErrorMessage("Email Adresi Sistemde Kay�tl� de�il ",result);
		result = result ? accountService.signIn(loginUser): false ;
		
		if(result ) System.out.println("Kullan�c� Ba�ar�l� bir �ekilde Siteme  Giri� Yapt� ");
		else		System.out.println("Kullan�c� Hatal� Bilgi Giri�i Yapt�.");
	}
	
	public boolean  handleErrorMessage(String message,boolean result ) {
		if(!result) {
			System.out.println(message);
			return false;
		}else return true;
	}

	@Override
	public void signUp(User user) {
		// TODO Auto-generated method stub
		boolean result = checkUserSignUp(user);
		
		LoginUser loginUser = new LoginUser(user.geteMail(),user.getPassword());
		
		result = result ? UserNotifications.verificationMail(user.geteMail(), "Sisteme Kay�t Olabilmek i�in onay vermeniz gerekmektedir."):false ;

		result = result ? accountService.signUp(loginUser): false ;
		
		if(result) { 
			usersDao.add(user);
			System.out.println("Kullan�c� Sisteme Kay�t Edildi");
		}else {
			System.out.println("Sistemsel Bir Hata Mevcut");
		}
			
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		usersDao.add(user);
		System.out.println("Kullan�c� sisteme eklendi");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		usersDao.update(user);
		System.out.println("Kullan�c� sistemde g�ncellendi");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullan�c� sistemden silindi");
		usersDao.delete(user);
	}

	public boolean checkUserPasswordAndEmail(String eMail ,String password) {
		boolean result = false;
		if (password.length()>=6 && eMailValidate(eMail) && !password.isEmpty() && !eMail.isEmpty()) {
			result = true;
		}else {
			System.out.println("Kullan�c� Emaili yada �ifresi hatal� L�tfen Kontrol Ediniz.");
		}
		return result;
	}
	
	public boolean checkUserSignUp(User user) {
		boolean result = false;
		if(!usersDao.findEmail(user.geteMail()) 
				&& checkUserPasswordAndEmail(user.geteMail(),user.getPassword())
				&& checkFirstNameAndLastName(user.getFirstName(),user.getLastName()) ) 
		{
			result = true;
		}
		return result ;
	}
	
	public boolean checkFirstNameAndLastName(String firstName,String lastName) {
		boolean result = false; 
		if(firstName.length() >= 2 && lastName.length() >= 2 ) {
			result=true;
		}else {
			System.out.println("Kullan�c� Ad� ve Soyad� En az iki Karakterden Olu�mal�d��r.");
		} 
		return result;
	}
	
	
	//email Regex Pattern'i
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	//Email Kontrol fonksiyonu
	public static boolean eMailValidate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
	
}
