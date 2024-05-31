
package Service;

import Model.Depute;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public interface DeputeService extends Remote{
     Depute addDepute(Depute deputes) throws RemoteException;
    Depute editDepute(Depute deputes) throws RemoteException;
    Depute removeDepute(Depute deputes) throws RemoteException;
    Depute findDepute(Depute deputes) throws RemoteException;
    Depute loginDepute(String depute_id , String password, String role) throws RemoteException;
    List<Depute> allDeputes () throws RemoteException;
}
