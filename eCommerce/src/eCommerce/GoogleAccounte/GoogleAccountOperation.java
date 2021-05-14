package eCommerce.GoogleAccounte;

public class GoogleAccountOperation {
	public boolean signInWithGoogleAccount(String password,String eMail) {
		boolean result = false; 
		if(password == "123456" && eMail== "kadriyecoer@gmail.com") {
			System.out.println("Kullanýcý Google Accountu ile sisteme Giriþ yaptý.");
			result =true;
		}else {
			
			System.out.println("Geçersiz Email.");
		}
		return result;
	}
    public boolean signUpWithGoogleAccount(String password,String eMail) {
    	System.out.println("Kullanýcý Google Accountu ile sisteme Kayýt yaptý.");
    	return true;
	}
}
