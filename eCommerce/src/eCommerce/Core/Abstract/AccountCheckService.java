package eCommerce.Core.Abstract;

import eCommerce.Entities.Dtos.LoginUser;

public interface AccountCheckService {
	boolean signIn(LoginUser loginUser);
	boolean signUp(LoginUser loginUser);
}
