import Concrete.MarioPlayerManager;
import Entities.Player;
import Abstract.BasePlayerManager;
import Adapters.MernisServiceAdapter;

public abstract class Main {

	public static void main(String[] args) throws Exception {
		      BasePlayerManager playerManager = new MarioPlayerManager(new MernisServiceAdapter()); 
		     playerManager.Save(new Player(Player.id,Player.firstName,Player.lastName,Player.dateOfBirth,Player.nationalityId));
		  

}
}