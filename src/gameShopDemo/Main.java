package gameShopDemo;

import java.time.LocalDate;
import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game AmongUs = new Game(1, "Among Us", "Ekip arkadaþlarýna çok oyunculu bir takým çalýþmasý ve ihanet oyununda katýl.", 8.5);
		Game Valorant = new Game(2, "Valorant" , "Valorant, free-to-play çok oyunculu taktiksel birinci þahýs niþancý video oyunudur.", 18);
		Campaign Yuzde20 = new Campaign(1,20.0, "%20 indirimli oyunlar", LocalDate.of(2021,5,12), LocalDate.of(2021, 5, 22));
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(AmongUs);
		gameManager.addGame(Valorant);
		gameManager.defineCampaign(Valorant,Yuzde20);
								   
		System.out.println("-------------------------------------------------------------");
		
		Gamer oyuncu1 = new Gamer(1, "Gülistan", "Ay", "gulistanay", LocalDate.of(2000, 9, 14), "11111111111");
		Gamer oyuncu2 = new Gamer(2, "Engin", "Demiroð", "engindemirog", LocalDate.of(1985, 1, 6), "11111111111");
		
		BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.signUp(oyuncu1);
		gamerManager.signUp(oyuncu2);
		gamerManager.delete(oyuncu2); 
		gamerManager.update(oyuncu1);
		
		System.out.println("-------------------------------------------------------------");
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(Valorant, oyuncu1);
		
		System.out.println("-------------------------------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign Yuzde15 = new Campaign(1, 20.0, "%15 indirimli oyunlar", LocalDate.of(2021,5,12), LocalDate.of(2021, 5, 16));
		
		campaignManager.addCampaign(Yuzde15);
		campaignManager.updateCampaign(Yuzde20);
		campaignManager.deleteCampaign(Yuzde15);
		
		
	}

	
	

}
