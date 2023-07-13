package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Player;
import Game.Game;

public class SalesManager implements ISalesService{

	@Override
	public void Sales(Player player, Game game) {
		System.out.println(player.firstName +"" + game.getGameName() + "" + game.getPrice());
	}

	@Override
	public void SalesWithCampaing(Player Player, Game game, Campaign campaign) {
		double newPrice = game.getPrice() -(game.getPrice() * campaign.discountRatio / 100 );
		game.getPrice();
		System.out.println("Oyun adı "+game.getGameName() +"Oyuncu "+ Entities.Player.firstName +"Fiyat "+ game.getPrice()+ "Kampanyalı fiyat" +newPrice );
	}

}
