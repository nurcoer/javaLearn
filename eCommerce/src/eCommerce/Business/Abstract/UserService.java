package eCommerce.Business.Abstract;

import eCommerce.Entities.Concrete.User;
import eCommerce.Entities.Dtos.LoginUser;

public interface UserService {
	void signIn(LoginUser loginUser);
	void signUp(User user);
	void add   (User user);
	void update(User user);
	void delete(User user);	
	
}
