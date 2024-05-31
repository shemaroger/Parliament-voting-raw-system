
package Service.Implementation;

import Dao.SetElectionDao;
import Model.SetElection;
import Service.SetElectionService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public class SetElectionServiceIMP extends UnicastRemoteObject implements SetElectionService{

    public SetElectionServiceIMP() throws RemoteException{
    }
    SetElectionDao dao = new SetElectionDao();
    @Override
    public SetElection addSetElection(SetElection setElections) throws RemoteException {
    return dao.recordSetElections(setElections);
    }

    @Override
    public SetElection editSetElection(SetElection setElections) throws RemoteException {
    return dao.updateSetElections(setElections);
    }

    @Override
    public SetElection removeSetElection(SetElection setElections) throws RemoteException {
    return dao.deleteSetElections(setElections);
    }

    @Override
    public SetElection findSetElection(SetElection setElections) throws RemoteException {
   return dao.searchSetElections(setElections);
    }

    @Override
    public List<SetElection> allElections() throws RemoteException {
   return dao.displaySetElections();
    }

    @Override
    public SetElection myDate(String status) throws RemoteException {
        return dao.getData(status);
    }
    
}
