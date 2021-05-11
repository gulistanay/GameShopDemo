package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface GameService {
	void addGame(Game game);
	void defineCampaign(Game game , Campaign campaign);
}
