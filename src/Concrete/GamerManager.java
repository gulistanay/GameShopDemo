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
			System.out.println("Kullan�c� kayd� olu�turuldu: " + gamer.getUserName());
		}else {
			System.out.println("Kay�t olu�turulamad�. L�tfen kimlik bilgilerinizin do�rulu�unu kontrol edin.");
		}
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgileriniz g�ncellendi: " + gamer.getUserName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� kayd� silindi: " + gamer.getUserName());
	}
}
