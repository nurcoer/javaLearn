package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.CampaignDao;
import Entities.Concrete.Campaing;

public class CampaingDao  implements CampaignDao {
	
	List<Campaing> campaigns;

	public CampaingDao() {

		this.campaigns = new ArrayList<>();
	}
	
	@Override
	public void add(Campaing object) {
		// TODO Auto-generated method stub
		campaigns.add(object);
	}

	@Override
	public void update(Campaing object) {
		// TODO Auto-generated method stub
		Campaing updateCampaign = campaigns.stream().filter((x) -> x.getCampaingName() == object.getCampaingName())
				.findFirst().orElse(null);

		updateCampaign.setCampaingName(object.getCampaingName());
		updateCampaign.setCampaignAmount(object.getCampaignAmount());
	}

	@Override
	public void delete(Campaing object) {
		// TODO Auto-generated method stub
		Campaing deleteCampaign = campaigns.stream().filter((x) -> x.getCampaingName() == object.getCampaingName())
				.findFirst().orElse(null);
		campaigns.remove(deleteCampaign);
		campaigns.remove(0);
	}
}
