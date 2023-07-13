package Adapters;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entities.Player;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) throws RemoteException {
	         MernisServiceReference.KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	      return   client.TCKimlikNoDogrula(Player.nationalityId, Player.firstName, Player.lastName, Player.dateOfBirth);
		
	}

}
