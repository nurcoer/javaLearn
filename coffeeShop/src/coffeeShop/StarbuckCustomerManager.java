package coffeeShop;

public class StarbuckCustomerManager extends BaseCustomerManager  {

	private CustomerCheckService customerCheckService;
	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIsRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
	}


}
