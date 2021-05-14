package eCommerce.Core.Concrete;

import java.util.Scanner;

import eCommerce.Core.Abstract.UserNotificationService;

public class EmailNotification implements UserNotificationService {

	@Override
	public boolean verificationMail(String eMail, String message) {
		// TODO Auto-generated method stub
		Scanner answer = new Scanner(System.in);
		System.out.print(eMail+" email adresine gelen "+message+" i�lemini onayl�yormusunuz.Y/N");
		String confirmation = answer.nextLine();
		if(confirmation.equals("Y") || confirmation.equals("y"))
			return true;
		else {
			System.out.println("Sisyeme kay�t olabilmek i�in mail onay� gerekli. ");
			return false;
		}
	}

}
