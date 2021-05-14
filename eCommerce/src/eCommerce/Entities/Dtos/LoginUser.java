package eCommerce.Entities.Dtos;

import eCommerce.Entities.Abstract.Dto;

public class LoginUser implements Dto{

	private String eMail;
	private String password;
	public LoginUser(String eMail, String password) {
		super();
		this.eMail = eMail;
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
