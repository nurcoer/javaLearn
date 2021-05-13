package Business.Abstract;

import Entities.Concrete.Gamer;

public interface GamerCheckService {
	boolean checkIsRealPerson(Gamer gamer);
}