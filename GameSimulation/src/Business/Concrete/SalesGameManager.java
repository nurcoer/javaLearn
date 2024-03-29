package Business.Concrete;

import Business.Abstract.SalesGameService;
import DataAccess.Abstract.SalesGameDao;
import Entities.Concrete.SalesGame;

public class SalesGameManager  implements  SalesGameService{

	SalesGameDao salesGamerDao;
	
	public SalesGameManager(SalesGameDao salesGamerDao) {

		this.salesGamerDao = salesGamerDao;
	}

	@Override
	public void add(SalesGame object) {
		// TODO Auto-generated method stub
		salesGamerDao.add(object);
		System.out.println(object.getGamer().getFirstName() +"Kullanıcısına "+object.getGame().getGameName()+"Oyun "+object.getCampainingPrice()+" kampanyalı fiyattan satışı gerçekleşmiştir." );
	}

	@Override
	public void update(SalesGame object) {
		// TODO Auto-generated method stub
		salesGamerDao.update(object);
		System.out.println(object.getGamer().getFirstName() +"Kullanıcısına "+object.getGame().getGameName()+"Oyun satış güncellenmiştir." );
	}

	@Override
	public void delete(SalesGame object) {
		// TODO Auto-generated method stub
		salesGamerDao.delete(object);
		System.out.println(object.getGamer().getFirstName() +"Kullanıcısına "+object.getGame().getGameName()+"gerçekleştirilen oyununun satışı iptal edilmiştir." );
	}


}
