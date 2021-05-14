package eCommerce.DataAccess.Abstarct;

import eCommerce.Entities.Concrete.User;
public interface UsersDao {
		void add   (User user);
		void update(User user);
		void delete(User user);	
		User getById(int id);
		boolean findEmail(String eMailStr);
}
