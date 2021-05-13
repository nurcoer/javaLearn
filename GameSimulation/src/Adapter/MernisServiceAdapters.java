package Adapter;

import Business.Abstract.GamerCheckService;
import Entities.Concrete.Gamer;

public class MernisServiceAdapters implements GamerCheckService {

	@Override
	public boolean checkIsRealPerson(Gamer gamer) {
		KPSPublicSoapClient client= new KPSPublicSoapClient();
		return client.TCKimlikNoDoðrula(gamer.getNationalityId(),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getBirthDate().toLocalDate().getYear());
		
	}

}
