package eCommerce.GoogleAccounte;

public class GoogleAccountOperation {
	public boolean signInWithGoogleAccount(String password,String eMail) {
		boolean result = false; 
		if(password == "123456" && eMail== "kadriyecoer@gmail.com") {
			System.out.println("Kullan�c� Google Accountu ile sisteme Giri� yapt�.");
			result =true;
		}else {
			
			System.out.println("Ge�ersiz Email.");
		}
		return result;
	}
    public boolean signUpWithGoogleAccount(String password,String eMail) {
    	System.out.println("Kullan�c� Google Accountu ile sisteme Kay�t yapt�.");
    	return true;
	}
}
