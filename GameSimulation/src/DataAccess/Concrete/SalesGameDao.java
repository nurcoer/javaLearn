package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.SalesGame;

public class SalesGameDao implements DataAccess.Abstract.SalesGameDao{
	List<SalesGame> salesGames;

	public SalesGameDao() {

		this.salesGames = new ArrayList<>();
	}
	
	@Override
	public void add(SalesGame object) {
		// TODO Auto-generated method stub
		salesGames.add(object);
	}

	@Override
	public void update(SalesGame object) {
		// TODO Auto-generated method stub
		SalesGame updateSalesGames = salesGames.stream().filter((x) ->x.getGamer() == object.getGamer()&& x.getGame()==object.getGame()&&x.getCampaign()==object.getCampaign())
				.findFirst().orElse(null);

		updateSalesGames .setCampaign(object.getCampaign());
		updateSalesGames .setGame(object.getGame());
		updateSalesGames .setGamer(object.getGamer());
	}

	@Override
	public void delete(SalesGame object) {
		// TODO Auto-generated method stub
		SalesGame deleteSalesGame = salesGames.stream().filter((x) -> x.getGamer() == object.getGamer()&& x.getGame()==object.getGame()&&x.getCampaign()==object.getCampaign())
				.findFirst().orElse(null);
		salesGames.remove(deleteSalesGame);
		salesGames.remove(0);
	}


}
