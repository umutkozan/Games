package Abstract;

import Entities.Campaign;
import Entities.Player;
import Game.Game;

public interface ISalesService {

	void Sales(Player player, Game game);

	void SalesWithCampaing(Player Player, Game game, Campaign campaign);

}
