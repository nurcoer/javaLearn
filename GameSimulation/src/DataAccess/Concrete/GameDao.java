package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.GamingDao;
import Entities.Concrete.Game;

public class GameDao implements GamingDao {
	
	List<Game> games;

	public GameDao() {

		this.games = new ArrayList<>();
	}
	
	@Override
	public void add(Game object) {
		// TODO Auto-generated method stub
		games.add(object);
		
	}

	@Override
	public void update(Game object) {
		// TODO Auto-generated method stub
		Game updateGames = games.stream().filter((x) -> x.getGameName() == object.getGameName())
				.findFirst().orElse(null);

		updateGames .setGameName(object.getGameName());
		updateGames .setDescription(object.getDescription());
		updateGames .setPrice(object.getPrice());
	}

	@Override
	public void delete(Game object) {
		// TODO Auto-generated method stub
		Game deleteGame = games.stream().filter((x) -> x.getGameName() == object.getGameName())
				.findFirst().orElse(null);
		games.remove(deleteGame);
		games.remove(0);
	}

}
