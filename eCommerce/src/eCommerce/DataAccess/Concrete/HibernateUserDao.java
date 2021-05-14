package eCommerce.DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import eCommerce.DataAccess.Abstarct.UsersDao;
import eCommerce.Entities.Concrete.User;

public class HibernateUserDao implements UsersDao {
	List<User> users;

	public HibernateUserDao() {
		this.users = new ArrayList<>();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		User updatedUser = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		if(updatedUser != null) {
			updatedUser.seteMail(user.geteMail());
			updatedUser.setFirstName(user.getFirstName());
			updatedUser.setLastName(user.getLastName());
			updatedUser.setPassword(user.getPassword());
		}else {System.out.println("Kullanýcý kayýtlý deðil");}
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		User deletedUser = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		if(deletedUser != null) {
			users.remove(deletedUser);
			users.remove(0);
		}else {
			System.out.println("Kullanýcý sistememde kayýtlý deðil");
		}
	}
	
	public User getById(int id) {
		return users.stream().filter(u -> u.getId()==id).findFirst().orElse(null);
	}
	
	public boolean findEmail(String eMailStr) {
		User user=  users.stream().filter(u -> u.geteMail()==eMailStr).findFirst().orElse(null);
		return user != null? true:false;
	}

}
