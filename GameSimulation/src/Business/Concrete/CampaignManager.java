package Business.Concrete;

import Business.Abstract.CampaignService;
import DataAccess.Abstract.CampaignDao;
import Entities.Concrete.Campaing;

public class CampaignManager implements CampaignService {

	CampaignDao campaingDao;
	
	public CampaignManager(CampaignDao campaingDao) {

		this.campaingDao = campaingDao;
	}

	@Override
	public void add(Campaing object) {
		// TODO Auto-generated method stub
		campaingDao.add(object);
		System.out.println(object.getCampaingName()+"  kampanyası eklenmiştir.");
		
	}

	@Override
	public void update(Campaing object) {
		// TODO Auto-generated method stub
		campaingDao.update(object);
		System.out.println(object.getCampaingName()+"  kampanyası güncellenmiştir.");
	}

	@Override
	public void delete(Campaing object) {
		// TODO Auto-generated method stub
		campaingDao.delete(object);
		System.out.println(object.getCampaingName()+"  kampanyası silinmiştir.");
		
	}
}
