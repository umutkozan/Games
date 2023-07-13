package Abstract;



import Entities.Player;

public  class BasePlayerManager implements IPlayerService{

	
	public void Save(Player player) throws Exception
	{
	  System.out.println("Veritabanına kaydedildi"+Player.firstName);
	 return;
	}




}
