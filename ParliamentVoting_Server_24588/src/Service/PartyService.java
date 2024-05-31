
package Service;

import Model.Party;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public interface PartyService extends Remote{
    Party addParty(Party parties) throws RemoteException;
    Party editParty(Party parties) throws RemoteException;
    Party removeParty(Party parties) throws RemoteException;
    Party findParty(Party parties) throws RemoteException;
    List<Party> allParties () throws RemoteException;
}
