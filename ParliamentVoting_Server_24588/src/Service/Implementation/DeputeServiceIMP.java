
package Service.Implementation;

import Dao.DeputeDao;
import Model.Depute;
import Service.DeputeService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public class DeputeServiceIMP extends UnicastRemoteObject implements DeputeService{

    public DeputeServiceIMP() throws RemoteException{
    }
    DeputeDao dao = new DeputeDao();
    @Override
    public Depute addDepute(Depute deputes) throws RemoteException {
     return dao.recordDeputes(deputes);
    }

    @Override
    public Depute editDepute(Depute deputes) throws RemoteException {
     return dao.updateDeputes(deputes);
    }

    @Override
    public Depute removeDepute(Depute deputes) throws RemoteException {
    return dao.deleteDeputes(deputes);
    }

    @Override
    public Depute findDepute(Depute deputes) throws RemoteException {
    return dao.searchDeputes(deputes);
    }

    @Override
    public List<Depute> allDeputes() throws RemoteException {
    return dao.displayDeputes();
    }

    @Override
    public Depute loginDepute(String depute_id , String password, String role) throws RemoteException {
     return dao.userDepute(depute_id , password, role);
    }
}
