package Business.Concrete;

import Business.Abstract.GameService;
import DataAccess.Abstract.GamingDao;
import Entities.Concrete.Game;

public class GameManager implements  GameService{

	GamingDao gameDao;
	
	public GameManager(GamingDao gameDao) {

		this.gameDao = gameDao;
	}

	@Override
	public void add(Game object) {
		// TODO Auto-generated method stub
		gameDao.add(object);
		System.out.println("Oyun Eklenmiþtir"+object.getGameName());
	}

	@Override
	public void update(Game object) {
		// TODO Auto-generated method stub
		gameDao.update(object);
		System.out.println("Oyun güncellenmiþtir"+object.getGameName());
	}

	@Override
	public void delete(Game object) {
		// TODO Auto-generated method stub
		gameDao.delete(object);
		System.out.println("Oyun silinmiþtir"+object.getGameName());
	}

}
