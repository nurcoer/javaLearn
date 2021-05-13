package DataAccess.Abstract;

import java.util.List;

import Entities.Concrete.Gamer;

public interface GamerDao extends BaseDao<Gamer>{
	List<Gamer> GetAllGamer();	
}
