package coffeeShop;

public class MernisServiceAdapters implements CustomerCheckService {

	@Override
	public boolean checkIsRealPerson(Customer customer) {
		KPSPublicSoapClient client= new KPSPublicSoapClient();
		return client.TCKimlikNoDo�rula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		
	}

}
