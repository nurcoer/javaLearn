package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.Gamer;

public class GamerDao implements DataAccess.Abstract.GamerDao {
	
	List<Gamer> gamers;

	public GamerDao() {

		this.gamers = new ArrayList<>();
	}
	
	@Override
	public void add(Gamer object) {
		// TODO Auto-generated method stub
		gamers.add(object);
	}

	@Override
	public void update(Gamer object) {
		// TODO Auto-generated method stub
		Gamer updateGamers = gamers.stream().filter((x) -> x.getNationalityId() == object.getNationalityId())
				.findFirst().orElse(null);

		updateGamers .setBirthDate(object.getBirthDate());
		updateGamers .setFirstName(object.getFirstName());
		updateGamers .setId(object.getId());
		updateGamers .setLastName(object.getLastName());
		updateGamers .setNationalityId(object.getNationalityId());
	}

	@Override
	public void delete(Gamer object) {
		// TODO Auto-generated method stub
		Gamer deleteGamer = gamers.stream().filter((x) -> x.getNationalityId() == object.getNationalityId())
				.findFirst().orElse(null);
		gamers.remove(deleteGamer);
		gamers.remove(0);
	}

	@Override
	public List<Gamer> GetAllGamer() {
		// TODO Auto-generated method stub
		return gamers;
	}

}
