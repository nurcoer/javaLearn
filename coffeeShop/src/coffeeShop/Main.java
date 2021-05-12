package coffeeShop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager =new StarbuckCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1,"Nur","Cöer","1997","1112223334"));
	}

}
