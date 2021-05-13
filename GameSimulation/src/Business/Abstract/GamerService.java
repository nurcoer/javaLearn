package Business.Abstract;


import java.util.List;

import DataAccess.Abstract.BaseDao;
import Entities.Concrete.Gamer;

public interface GamerService  extends BaseDao<Gamer>{
	List<Gamer> GetAllGamer();	
}
