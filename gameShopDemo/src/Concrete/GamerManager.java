package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void signUp(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.signUp(gamer);
			System.out.println("Kullanýcý kaydý oluþturuldu: " + gamer.getUserName());
		}else {
			System.out.println("Kayýt oluþturulamadý. Lütfen kimlik bilgilerinizin doðruluðunu kontrol edin.");
		}
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgileriniz güncellendi: " + gamer.getUserName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý kaydý silindi: " + gamer.getUserName());
	}
}
