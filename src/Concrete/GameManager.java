package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println("Oyun eklendi: " + game.getName());
		
	}

	
	@Override
	public void defineCampaign(Game game, Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý " + game.getName() + " oyunu için tanýmlandý." );
		
	}

}
