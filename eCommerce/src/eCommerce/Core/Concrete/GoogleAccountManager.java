package eCommerce.Core.Concrete;

import eCommerce.Core.Abstract.AccountCheckService;
import eCommerce.Entities.Dtos.LoginUser;
import eCommerce.GoogleAccounte.GoogleAccountOperation;

public class GoogleAccountManager implements AccountCheckService {
	
		// TODO Auto-generated method stub
		
	GoogleAccountOperation googleAccount= new GoogleAccountOperation();

		@Override
		public boolean signIn(LoginUser loginUser) {
			// TODO Auto-generated method stub
			return googleAccount.signInWithGoogleAccount(loginUser.getPassword(), loginUser.geteMail());
			
		}

		@Override
		public boolean signUp(LoginUser loginUser) {
			// TODO Auto-generated method stub
			return googleAccount.signUpWithGoogleAccount(loginUser.getPassword(), loginUser.geteMail());
			
		}
	

}
