package ch6homework.problems.Exercise18;

public class ShopService {

	static private ShopService shopservice = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return shopservice;
	}
}
