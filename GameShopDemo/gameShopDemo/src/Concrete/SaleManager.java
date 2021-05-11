package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;


public class SaleManager implements SaleService{
	
	@Override
	public void sale(Game game, Gamer gamer) {
		
		System.out.println(game.getName() + " adlý oyunun " + gamer.getUserName() + " adlý oyuncuya " + game.getPrice() +" TL'ye satýþý gerçekleþti." );	
	}
	
}
