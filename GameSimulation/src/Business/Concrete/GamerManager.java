package Business.Concrete;

import java.util.List;

import Business.Abstract.GamerCheckService;
import Business.Abstract.GamerService;
import DataAccess.Abstract.GamerDao;
import Entities.Concrete.Gamer;

public class GamerManager implements  GamerService{

	private GamerDao gamerDao;
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerDao gamerDao,GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		this.gamerDao = gamerDao;
	}
	

	@Override
	public void add(Gamer object) {
		// TODO Auto-generated method stub
		if(gamerCheckService.checkIsRealPerson(object)) {
			gamerDao.add(object);
			System.out.println("Oyuncu eklenmiþtir"+object.getFirstName()+" "+object.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void update(Gamer object) {
		// TODO Auto-generated method stub
		gamerDao.update(object);
		System.out.println("Oyuncu güncellenmiþtir"+object.getFirstName()+" "+object.getLastName());
	}

	@Override
	public void delete(Gamer object) {
		// TODO Auto-generated method stub
		gamerDao.delete(object);
		System.out.println("Oyuncu silinmiþtir"+object.getFirstName()+" "+object.getLastName());
	}

	@Override
	public List<Gamer> GetAllGamer() {
		// TODO Auto-generated method stub
		
		return gamerDao.GetAllGamer();
	}

}
